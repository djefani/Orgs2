package br.com.alura.orgs.model

import java.math.BigDecimal
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Produto(
        val nome: String,
        val descricao: String,
        val valor: BigDecimal,
        val imagem: String? = null
) : Parcelable
