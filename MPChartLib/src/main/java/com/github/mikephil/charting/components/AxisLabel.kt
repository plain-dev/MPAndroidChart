@file:JvmName("AxisLabelOption")

package com.github.mikephil.charting.components

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Typeface
import androidx.annotation.ColorInt
import androidx.annotation.Px
import com.github.mikephil.charting.utils.Utils

sealed class Location
object LocationStart : Location()
object LocationCenter : Location()
object LocationEnd : Location()

sealed class Align(val paintAlign: Paint.Align)
object AlignLeft : Align(Paint.Align.LEFT)
object AlignCenter : Align(Paint.Align.CENTER)
object AlignRight : Align(Paint.Align.RIGHT)

sealed class VerticalAlign
object VerticalAlignTop : VerticalAlign()
object VerticalAlignCenter : VerticalAlign()
object VerticalAlignBottom : VerticalAlign()

const val DEFAULT_RESERVED_SPACE = 30f;

class AxisLabel @JvmOverloads constructor(
    var isEnabled: Boolean = false,
    var location: Location = LocationEnd,
    var name: String = "",
    @Px var size: Float = Utils.convertDpToPixel(10f),
    @ColorInt var color: Int = Color.parseColor("#FF666666"),
    var typeface: Typeface = Typeface.DEFAULT,
    var align: Align = AlignCenter,
    var verticalAlign: VerticalAlign = VerticalAlignCenter
)