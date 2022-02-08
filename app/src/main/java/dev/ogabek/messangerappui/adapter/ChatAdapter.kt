package dev.ogabek.messangerappui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import dev.ogabek.messangerappui.R
import dev.ogabek.messangerappui.model.Chat
import dev.ogabek.messangerappui.model.Room

class ChatAdapter(val context: Context, val items: ArrayList<Chat>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_ITEM_ROOM = 0;
    private val TYPE_ITEM_MESSAGE = 1;

    override fun getItemViewType(position: Int): Int {
        val feed  = items[position]
        if (feed.rooms.size > 0)
            return TYPE_ITEM_ROOM
        return TYPE_ITEM_MESSAGE
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == TYPE_ITEM_ROOM) {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat_room, parent, false)
            return RoomViewHolder(context, view)
        }
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat_message, parent, false)
        return MessageViewHolder(view)
    }

    class MessageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val profile: ShapeableImageView = view.findViewById(R.id.iv_profile)
        val fullName: TextView = view.findViewById(R.id.tv_full_name)
        val isOnline: LinearLayout = view.findViewById(R.id.is_online)
    }

    class RoomViewHolder(context: Context, view: View) : RecyclerView.ViewHolder(view) {
        val recyclerView: RecyclerView = view.findViewById(R.id.rv_chat_room)

        init {
            val manager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            recyclerView.layoutManager = manager
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val message = items[position]

        if (holder is RoomViewHolder) {
            holder.apply {
                refreshAdapter(recyclerView, message.rooms)
            }
        }
        if (holder is MessageViewHolder) {
            holder.apply {
                profile.setImageResource(message.message!!.profile)
                fullName.text = message.message!!.fullName
                if (message.message!!.isOnline) {
                    isOnline.visibility = View.VISIBLE
                } else {
                    isOnline.visibility = View.GONE
                }
            }
        }
    }

    private fun refreshAdapter(recyclerView: RecyclerView, rooms: List<Room>) {
        val adapter = RoomAdapter(context, rooms)
        recyclerView.adapter = adapter
    }

    override fun getItemCount() = items.size
}