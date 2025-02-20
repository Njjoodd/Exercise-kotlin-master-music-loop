package MusicMaster
fun main () {
    val songs: List<String> = listOf("Euphoria", "Snooze", "Luther",)
    playAll(songs)
}

fun playAll(songs: List<String>) {
    for (song in songs) {
        println("Now playing: $song")
    }
}