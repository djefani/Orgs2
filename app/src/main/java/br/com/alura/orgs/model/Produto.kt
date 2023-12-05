package br.com.alura.orgs.model

import java.math.BigDecimal
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity
@Parcelize
data class Produto(
        @PrimaryKey(autoGenerate = true)
        val id: Long = 0L,
        val nome: String,
        val descricao: String,
        val valor: BigDecimal,
        val imagem: String? = null
) : Parcelable
