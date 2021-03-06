package dev.luckybet100.android.dragging.drag

import dev.luckybet100.android.dragging.DragChildrenBoundsProvider

interface DragDelegate {

    sealed class State {

        object Idle : State()

        data class Dragging(
            val startX: Int,
            val startY: Int,
            val index: Int
        ) : State()

    }

    val childrenDelegate: DragChildrenBoundsProvider

    fun getDraggingIndex(): Int
    fun start(x: Int, y: Int): Boolean
    fun update(x: Int, y: Int): Boolean
    fun end(): Boolean

}