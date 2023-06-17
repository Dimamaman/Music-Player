package uz.gita.dima.qosiqlar.presenter.songlist

import uz.gita.dima.qosiqlar.presenter.base.BaseView
import uz.gita.dima.qosiqlar.model.Song

interface SongListView : BaseView {
    fun showLoading()

    fun stopLoading()

    fun updateSongState(song: Song, isPlaying: Boolean)

    fun onSongClick()
}