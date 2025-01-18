package org.example.project.book.presentation.bookList

import org.example.project.book.domain.Book

sealed interface BookListAction {
    data class OnSearchQueryChanged(
        val query: String,
    ) : BookListAction

    data class OnBookClicked(
        val book: Book,
    ) : BookListAction

    data class OnTabSelected(
        val tabIndex: Int,
    ) : BookListAction
}
