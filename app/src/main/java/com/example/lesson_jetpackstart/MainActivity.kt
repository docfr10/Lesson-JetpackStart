package com.example.lesson_jetpackstart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lesson_jetpackstart.ui.theme.LessonJetpackStartTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // В данном методе начинается создание интерфейса приложения
        setContent {
            // Метод, определяющий тему и визуальное отображение элементов(цветов, шрифта и пр.)
            LessonJetpackStartTheme {
                //UserInterface()
                Containers()
            }
        }
    }
}

// Аннотация @Composable позволяет выделить функцию в коде и задать ей возможность отрисовки UI
@Composable
// Предпросмотр интерфейса при помощи @Preview позволяет увидеть интерфейс приложения без запуска телефона
@Preview(showBackground = true, showSystemUi = true)
fun UserInterface() {
    // UI элемент, показывающий текст на экране
    Text(
        text = "Hello, World!",
        // modifier — позволяет визуально изменять элементы
        modifier = Modifier
            // Задает отступы для элемента
            .padding(
                horizontal = 100.dp,
                vertical = 150.dp
            )
            // Размер того, сколько элемент занимает места на экране
            .size(200.dp),
        // Размер шрифта текста
        fontSize = 30.sp
    )
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun Containers() {
    // Контейнер Column — колонна, размещает элементы сверху-вниз
    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp),
        modifier = Modifier
        .fillMaxHeight()
        .padding(vertical = 100.dp)
        // Обводка элемента
        .border(2.dp, Color.Green)
        // Обрезка элемента по форме
        .clip(shape = CircleShape)
    ) {
        Text("Text 1", modifier = Modifier.background(Color.Red))
        Text("Text 2", modifier = Modifier.background(Color.Gray))
        Text(
            "Text 3", modifier = Modifier
                .size(100.dp)
                .background(Color.Blue)
        )
    }

    // Контейнер Row — ряд, размещает элементы слева-направо
    Row(
        // Располагает элементы ВНУТРИ Row с определенным интервалом
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            // Задавание элементу заполнения всего
            // пространства по горизонтали
            .fillMaxWidth()
            .padding(vertical = 50.dp)) {
        Text("Text 4")
        Text("Text 5")
        Text("Text 6")
    }

    // Контейнер Box — накладывает элементы друг на друга
    Box(
        contentAlignment = Alignment.BottomStart,
        modifier = Modifier.padding(vertical = 350.dp, horizontal = 250.dp).size(400.dp))
    {
        Text("Text 7")
        Text("Text 8")
        Text("Text 9")
    }
}









