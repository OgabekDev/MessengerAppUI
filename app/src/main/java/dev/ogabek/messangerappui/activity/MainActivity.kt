package dev.ogabek.messangerappui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.messangerappui.R
import dev.ogabek.messangerappui.adapter.ChatAdapter
import dev.ogabek.messangerappui.model.Chat
import dev.ogabek.messangerappui.model.Message
import dev.ogabek.messangerappui.model.Room
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        recyclerView = findViewById(R.id.rv_main)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        refreshAdapter(getAllChats())

    }

    private fun refreshAdapter(chats: List<Chat>) {
        val adapter = ChatAdapter(this, getAllChats())
        recyclerView.adapter = adapter
    }

    private fun getAllChats(): ArrayList<Chat> {
        val stories: ArrayList<Room> = ArrayList()
        stories.add(Room(R.drawable.aziz, "Azizbek"))
        stories.add(Room(R.drawable.bogibek, "Bogibek Matyaqubov"))
        stories.add(Room(R.drawable.elmurod, "Elmurod Nazirov"))
        stories.add(Room(R.drawable.jabbor, "Jabbor"))
        stories.add(Room(R.drawable.ogabekdev, "Ogabek Matyakubov"))
        stories.add(Room(R.drawable.shakhriyor, "Shakhriyor"))
        stories.add(Room(R.drawable.yahyo, "Yahyo Mahmudiy"))
        stories.add(Room(R.drawable.aziz, "Azizbek"))
        stories.add(Room(R.drawable.bogibek, "Bogibek Matyaqubov"))
        stories.add(Room(R.drawable.elmurod, "Elmurod Nazirov"))
        stories.add(Room(R.drawable.jabbor, "Jabbor"))
        stories.add(Room(R.drawable.ogabekdev, "Ogabek Matyakubov"))
        stories.add(Room(R.drawable.shakhriyor, "Shakhriyor"))
        stories.add(Room(R.drawable.yahyo, "Yahyo Mahmudiy"))
        stories.add(Room(R.drawable.aziz, "Azizbek"))
        stories.add(Room(R.drawable.bogibek, "Bogibek Matyaqubov"))
        stories.add(Room(R.drawable.elmurod, "Elmurod Nazirov"))
        stories.add(Room(R.drawable.jabbor, "Jabbor"))
        stories.add(Room(R.drawable.ogabekdev, "Ogabek Matyakubov"))
        stories.add(Room(R.drawable.shakhriyor, "Shakhriyor"))
        stories.add(Room(R.drawable.yahyo, "Yahyo Mahmudiy"))
        stories.add(Room(R.drawable.aziz, "Azizbek"))
        stories.add(Room(R.drawable.bogibek, "Bogibek Matyaqubov"))
        stories.add(Room(R.drawable.elmurod, "Elmurod Nazirov"))
        stories.add(Room(R.drawable.jabbor, "Jabbor"))
        stories.add(Room(R.drawable.ogabekdev, "Ogabek Matyakubov"))
        stories.add(Room(R.drawable.shakhriyor, "Shakhriyor"))
        stories.add(Room(R.drawable.yahyo, "Yahyo Mahmudiy"))

        val chats: ArrayList<Chat> = ArrayList()
        chats.add(Chat(stories))
        chats.add(Chat(Message(R.drawable.aziz, "Azizbek")))
        chats.add(Chat(Message(R.drawable.bogibek, "Bogibek Matyaqubov", true)))
        chats.add(Chat(Message(R.drawable.elmurod, "Elmurod Nazirov", true)))
        chats.add(Chat(Message(R.drawable.jabbor, "Jabbor")))
        chats.add(Chat(Message(R.drawable.ogabekdev, "Ogabek Matyakubov", true)))
        chats.add(Chat(Message(R.drawable.shakhriyor, "Shakhriyor")))
        chats.add(Chat(Message(R.drawable.yahyo, "Yahyo Mahmudiy", true)))
        chats.add(Chat(Message(R.drawable.aziz, "Azizbek")))
        chats.add(Chat(Message(R.drawable.bogibek, "Bogibek Matyaqubov", true)))
        chats.add(Chat(Message(R.drawable.elmurod, "Elmurod Nazirov", true)))
        chats.add(Chat(Message(R.drawable.jabbor, "Jabbor")))
        chats.add(Chat(Message(R.drawable.ogabekdev, "Ogabek Matyakubov", true)))
        chats.add(Chat(Message(R.drawable.shakhriyor, "Shakhriyor")))
        chats.add(Chat(Message(R.drawable.yahyo, "Yahyo Mahmudiy", true)))
        chats.add(Chat(Message(R.drawable.aziz, "Azizbek")))
        chats.add(Chat(Message(R.drawable.bogibek, "Bogibek Matyaqubov", true)))
        chats.add(Chat(Message(R.drawable.elmurod, "Elmurod Nazirov", true)))
        chats.add(Chat(Message(R.drawable.jabbor, "Jabbor")))
        chats.add(Chat(Message(R.drawable.ogabekdev, "Ogabek Matyakubov", true)))
        chats.add(Chat(Message(R.drawable.shakhriyor, "Shakhriyor")))
        chats.add(Chat(Message(R.drawable.yahyo, "Yahyo Mahmudiy", true)))
        chats.add(Chat(Message(R.drawable.aziz, "Azizbek")))
        chats.add(Chat(Message(R.drawable.bogibek, "Bogibek Matyaqubov", true)))
        chats.add(Chat(Message(R.drawable.elmurod, "Elmurod Nazirov", true)))
        chats.add(Chat(Message(R.drawable.jabbor, "Jabbor")))
        chats.add(Chat(Message(R.drawable.ogabekdev, "Ogabek Matyakubov", true)))
        chats.add(Chat(Message(R.drawable.shakhriyor, "Shakhriyor")))
        chats.add(Chat(Message(R.drawable.yahyo, "Yahyo Mahmudiy", true)))
        chats.add(Chat(Message(R.drawable.aziz, "Azizbek")))
        chats.add(Chat(Message(R.drawable.bogibek, "Bogibek Matyaqubov", true)))
        chats.add(Chat(Message(R.drawable.elmurod, "Elmurod Nazirov", true)))
        chats.add(Chat(Message(R.drawable.jabbor, "Jabbor")))
        chats.add(Chat(Message(R.drawable.ogabekdev, "Ogabek Matyakubov", true)))
        chats.add(Chat(Message(R.drawable.shakhriyor, "Shakhriyor")))
        chats.add(Chat(Message(R.drawable.yahyo, "Yahyo Mahmudiy", true)))

        return chats
    }
}