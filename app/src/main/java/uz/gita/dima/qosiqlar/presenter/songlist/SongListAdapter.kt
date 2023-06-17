package uz.gita.dima.qosiqlar.presenter.songlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.gita.dima.qosiqlar.databinding.AdapterSongListBinding
import uz.gita.dima.qosiqlar.model.Song
import uz.gita.dima.qosiqlar.model.SongItemCallback
import uz.gita.dima.qosiqlar.model.TimeUtil

class SongListAdapter(private val presenter: SongListPresenter) :
    ListAdapter<Song, SongListAdapter.SongHolder>(SongItemCallback()) {
    inner class SongHolder(val viewBinding: AdapterSongListBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {
        init {
            itemView.setOnClickListener {
                presenter.onSongClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongHolder {
        val viewBinding =
            AdapterSongListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SongHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: SongHolder, position: Int) {
        val song: Song = getItem(position)

        holder.viewBinding.tvName.text = song.name
        holder.viewBinding.tvArtist.text = song.author
        holder.viewBinding.tvDuration.text = TimeUtil.timeMillisToTime(song.duration)
    }
}