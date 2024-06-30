package com.example.myapplication

interface ChessDelegate {
    fun pieceAt(square: Square): ChessPiece?
          fun movePiece(from: Square, to: Square)
}

