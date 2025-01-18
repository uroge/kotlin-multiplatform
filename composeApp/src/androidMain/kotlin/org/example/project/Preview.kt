package org.example.project

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import org.example.project.book.presentation.bookList.components.BookSearchBar

@Suppress("ktlint:standard:function-naming")
@Preview
@Composable
private fun BookSearchBarPreview() {
    Box(
        modifier =
            Modifier
                .fillMaxWidth()
                .background(Color.White),
    ) {
        BookSearchBar(
            searchQuery = "",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier =
                Modifier
                    .fillMaxWidth(),
        )
    }
}
