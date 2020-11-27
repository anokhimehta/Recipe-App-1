package com.example.instafire.models

import com.google.firebase.firestore.PropertyName

data class Post(
    var description: String = "",
    var image_url: String = "",
    var creation_time: Long = 0,
    var user: User? = null
)