package uz.gita.dima.qosiqlar.presenter.playsong

import uz.gita.dima.qosiqlar.model.Song
import uz.gita.dima.qosiqlar.presenter.base.BaseView

interface PlaySongView : BaseView {
    fun updateSongState(song: Song, isPlaying: Boolean, progress: Int)

    fun showRepeat(isRepeat: Boolean)

    fun showRandom(isRandom: Boolean)
}