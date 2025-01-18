package org.example.project.book.presentation.bookList

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.example.project.book.domain.Book
import org.koin.compose.viewmodel.koinViewModel

@Suppress("ktlint:standard:function-naming")
@Composable
fun BookListScreenRoot(
    viewModel: BookListViewModel = koinViewModel(),
    onBookClick: (Book) -> Unit,
) {
    val state by viewModel.state
        .collectAsStateWithLifecycle()

    BookListScreen(state = state, onAction = { action ->
        when (action) {
            is BookListAction.OnBookClicked -> onBookClick(action.book)
            else -> Unit
        }
        viewModel.onAction(action)
    })
}

@Suppress("ktlint:standard:function-naming")
@Composable
private fun BookListScreen(
    state: BookListState,
    onAction: (BookListAction) -> Unit,
) {
}
