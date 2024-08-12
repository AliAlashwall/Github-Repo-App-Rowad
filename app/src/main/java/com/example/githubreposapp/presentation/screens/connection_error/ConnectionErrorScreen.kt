package com.example.githubreposapp.presentation.screens.connection_error

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githubreposapp.R
import com.example.githubreposapp.theme.GithubReposAppTheme
import com.example.githubreposapp.theme.LightGray
import com.example.githubreposapp.theme.LightGreen

@Composable
fun ConnectionErrorScreen(onRetryClicked: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))

        Image(
            painter = painterResource(id = R.drawable.connection_error),
            contentDescription = null,
            modifier = Modifier.size(300.dp).padding(16.dp)
        )


        Text(
            text = stringResource(R.string.something_went_wrong),
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = stringResource(id = R.string.network_exception_meesage),
            style = MaterialTheme.typography.bodyLarge,
            color = LightGray,
        )

        Spacer(modifier = Modifier.weight(1f))

        OutlinedButton(
            onClick = onRetryClicked,
            modifier = Modifier
                .padding(30.dp)
                .fillMaxWidth(),
            shape = MaterialTheme.shapes.medium,
            colors = ButtonDefaults.outlinedButtonColors(contentColor = LightGreen),
            border = BorderStroke(2.dp, LightGreen)
        ) {
            Text(
                text = stringResource(R.string.retry),
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun ConnectionErrorPreview() {
    GithubReposAppTheme {
        ConnectionErrorScreen {}
    }
}