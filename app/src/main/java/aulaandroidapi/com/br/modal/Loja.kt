package aulaandroidapi.com.br.modal

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class Loja(
    @SerializedName("perfume")
    val perfume: Perfume,
    ) : Parcelable