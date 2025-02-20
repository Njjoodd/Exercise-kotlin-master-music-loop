package MusicMaster

fun main() {
    val songs: MutableList<String> = mutableListOf("Euphoria", "Snooze", "Luther")
    addSong(songs, "In my room")
    shuffleSongs(songs)
    playAll(songs)
}

fun playAll(songs: List<String>) {
    for (song in songs) {
        println("Now playing: $song")
    }
}

fun addSong(songs: MutableList<String>, songTitle: String) {
    songs.add(songTitle)

}

fun shuffleSongs(songs: MutableList<String>) {
    songs.shuffle()
}

