package MusicMaster

fun main() {
    val songs: MutableList<String> = mutableListOf("Euphoria", "Snooze", "Luther")

    playAll(songs)

    addSong(songs, "In my room")

    playAll(songs)
}

fun playAll(songs: List<String>) {
    for (song in songs) {
        println("Now playing: $song")
    }
}

fun addSong(songs: MutableList<String>, songTitle: String) {
    songs.add(songTitle)
    println("Song added: $songTitle")
}
