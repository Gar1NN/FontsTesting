package com.example.fontstesting

class CardViewClass(
    category: String,
    typeface: String, font: String, case: String, size: Int, lineHeight: Int, letterSpacing: Double) {
    var _category = ""
    var _font = ""
    var _case = ""
    var _size = 0
    var _lineHeight = 0
    var _letterSpacing = 0.0
    var _typeface = ""
    init {
        _category =category
        _font = font
        _case = case
        _size = size
        _lineHeight = lineHeight
        _letterSpacing = letterSpacing
        _typeface = typeface
    }

}