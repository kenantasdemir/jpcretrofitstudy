package com.kenant42.jpcretrofitstudy
import androidx.lifecycle.viewmodel.compose.viewModel
import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.viewModelFactory
import com.kenant42.jpcretrofitstudy.entities.User
import com.kenant42.jpcretrofitstudy.repository.UserRepository
import com.kenant42.jpcretrofitstudy.ui.theme.JpcretrofitstudyTheme
import com.kenant42.jpcretrofitstudy.viewmodel.UserViewModel
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JpcretrofitstudyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Sayfa()
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Sayfa() {
    val userViewModel:UserViewModel = viewModel()
    val usersState = userViewModel.users.observeAsState()




    LaunchedEffect(key1 = true) {
        // Bu blok içine gerekirse başlangıç verilerini yükleme işlemleri eklenebilir
        userViewModel.getAllUsers()
    }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Users") })
        },
        content = {
            LazyColumn(modifier = Modifier.padding(top = 150.dp)) {
                items(6) {
                    // Her bir kullanıcı için özel işlemler burada yapılabilir


                }
            }
        }
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JpcretrofitstudyTheme {
        Sayfa()
    }
}