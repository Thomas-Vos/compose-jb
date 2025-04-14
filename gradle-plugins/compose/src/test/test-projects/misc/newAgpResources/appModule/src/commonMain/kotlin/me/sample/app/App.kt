package me.sample.app

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import newagpresources.appmodule.generated.resources.*
import org.jetbrains.compose.resources.stringResource

@Composable
fun App() {
    Column {
        val txt = "text: "
        Text(txt + stringResource(Res.string.str_1))
        MyFeatureText(txt = txt)
    }
}