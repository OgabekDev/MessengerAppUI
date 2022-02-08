package dev.ogabek.messangerappui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import dev.ogabek.messangerappui.R
import dev.ogabek.messangerappui.model.Room

class RoomAdapter(val context: Context, val rooms: List<Room>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_room_view, parent, false)
        return RoomViewHolder(view)
    }

    class RoomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val profile: ShapeableImageView = view.findViewById(R.id.iv_profile)
        val fullName: TextView = view.findViewById(R.id.tv_full_name)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val room = rooms[position]

        if (holder is RoomViewHolder) {
            holder.apply {
                profile.setImageResource(room.profile)
                fullName.text = room.fullName
            }
        }
    }

    override fun getItemCount() = rooms.size

}
