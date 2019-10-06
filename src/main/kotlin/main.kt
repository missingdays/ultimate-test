import arrow.optics.Lens

data class Player(val health: Int)

fun main() {
    val playerLens: Lens<Player, Int> = Lens(
        get = { player -> player.health },
        set = { player, value -> player.copy(health = value) }
    )

    println(playerLens.get(Player(0)))
}