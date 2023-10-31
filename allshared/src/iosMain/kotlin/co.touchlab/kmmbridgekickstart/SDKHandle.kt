package co.touchlab.kmmbridgekickstart

import co.touchlab.kmmbridgekickstart.repository.BreedRepository
import kotlinx.coroutines.flow.flow
import platform.posix.rand

data class SDKHandle(
    val breedRepository: BreedRepository,
    val appAnalytics: AppAnalytics,
    val breedAnalytics: BreedAnalytics
)

class SkieTest {
    fun intFlow() = flow {
        do {
            emit(rand())
        } while (true)
    }
}