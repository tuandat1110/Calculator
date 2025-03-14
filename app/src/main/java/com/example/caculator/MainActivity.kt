package com.example.caculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var button1:Button
    lateinit var button2:Button
    lateinit var button3:Button
    lateinit var button4:Button
    lateinit var button5:Button
    lateinit var button6:Button
    lateinit var button7:Button
    lateinit var button8:Button
    lateinit var button9:Button
    lateinit var button0:Button
    lateinit var buttonC:Button
    lateinit var buttonCE:Button
    lateinit var buttonCong:Button
    lateinit var buttonTru:Button
    lateinit var buttonNhan:Button
    lateinit var buttonChia:Button
    lateinit var screen:EditText
    lateinit var buttonDot:Button
    lateinit var buttonNgoacDong:Button
    lateinit var buttonNgoacMo:Button
    lateinit var buttonBang:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        screen = findViewById(R.id.Screen)
        button0 = findViewById(R.id.button0)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        buttonC = findViewById(R.id.button_C)
        buttonCE = findViewById(R.id.button_CE)
        buttonCong = findViewById(R.id.buttonCong)
        buttonTru = findViewById(R.id.buttonTru)
        buttonNhan = findViewById(R.id.buttonNhan)
        buttonChia = findViewById(R.id.buttonChia)
        buttonDot = findViewById(R.id.buttonDot)
        buttonNgoacDong = findViewById(R.id.buttonNgoacDong)
        buttonNgoacMo = findViewById(R.id.buttonNgoacMo)
        buttonBang = findViewById(R.id.buttonBang)

        button1.setOnClickListener {
            val cursorPos = screen.selectionStart // Lấy vị trí con trỏ
            val oldText = screen.text.toString() // Lấy nội dung hiện tại

            // Chèn số '3' vào vị trí con trỏ
            val newText = oldText.substring(0, cursorPos) + "1" + oldText.substring(cursorPos)

            screen.setText(newText)  // setText() chấp nhận String
            screen.setSelection(cursorPos + 1) // Đưa con trỏ về đúng vị trí sau số vừa chèn
        }


        button2.setOnClickListener {
            val cursorPos = screen.selectionStart // Lấy vị trí con trỏ
            val oldText = screen.text.toString() // Lấy nội dung hiện tại

            // Chèn số '3' vào vị trí con trỏ
            val newText = oldText.substring(0, cursorPos) + "2" + oldText.substring(cursorPos)

            screen.setText(newText)  // setText() chấp nhận String
            screen.setSelection(cursorPos + 1) // Đưa con trỏ về đúng vị trí sau số vừa chèn
        }
        button3.setOnClickListener {
            val cursorPos = screen.selectionStart // Lấy vị trí con trỏ
            val oldText = screen.text.toString() // Lấy nội dung hiện tại

            // Chèn số '3' vào vị trí con trỏ
            val newText = oldText.substring(0, cursorPos) + "3" + oldText.substring(cursorPos)

            screen.setText(newText)  // setText() chấp nhận String
            screen.setSelection(cursorPos + 1) // Đưa con trỏ về đúng vị trí sau số vừa chèn
        }

        button4.setOnClickListener {
            val cursorPos = screen.selectionStart // Lấy vị trí con trỏ
            val oldText = screen.text.toString() // Lấy nội dung hiện tại

            // Chèn số '3' vào vị trí con trỏ
            val newText = oldText.substring(0, cursorPos) + "4" + oldText.substring(cursorPos)

            screen.setText(newText)  // setText() chấp nhận String
            screen.setSelection(cursorPos + 1) // Đưa con trỏ về đúng vị trí sau số vừa chèn
        }
        button5.setOnClickListener {
            val cursorPos = screen.selectionStart // Lấy vị trí con trỏ
            val oldText = screen.text.toString() // Lấy nội dung hiện tại

            // Chèn số '3' vào vị trí con trỏ
            val newText = oldText.substring(0, cursorPos) + "5" + oldText.substring(cursorPos)

            screen.setText(newText)  // setText() chấp nhận String
            screen.setSelection(cursorPos + 1) // Đưa con trỏ về đúng vị trí sau số vừa chèn
        }

        button6.setOnClickListener {
            val cursorPos = screen.selectionStart // Lấy vị trí con trỏ
            val oldText = screen.text.toString() // Lấy nội dung hiện tại

            // Chèn số '3' vào vị trí con trỏ
            val newText = oldText.substring(0, cursorPos) + "6" + oldText.substring(cursorPos)

            screen.setText(newText)  // setText() chấp nhận String
            screen.setSelection(cursorPos + 1) // Đưa con trỏ về đúng vị trí sau số vừa chèn
        }

        button7.setOnClickListener {
            val cursorPos = screen.selectionStart // Lấy vị trí con trỏ
            val oldText = screen.text.toString() // Lấy nội dung hiện tại

            // Chèn số '3' vào vị trí con trỏ
            val newText = oldText.substring(0, cursorPos) + "7" + oldText.substring(cursorPos)

            screen.setText(newText)  // setText() chấp nhận String
            screen.setSelection(cursorPos + 1) // Đưa con trỏ về đúng vị trí sau số vừa chèn
        }
        button8.setOnClickListener {
            val cursorPos = screen.selectionStart // Lấy vị trí con trỏ
            val oldText = screen.text.toString() // Lấy nội dung hiện tại

            // Chèn số '3' vào vị trí con trỏ
            val newText = oldText.substring(0, cursorPos) + "8" + oldText.substring(cursorPos)

            screen.setText(newText)  // setText() chấp nhận String
            screen.setSelection(cursorPos + 1) // Đưa con trỏ về đúng vị trí sau số vừa chèn
        }
        button9.setOnClickListener {
            val cursorPos = screen.selectionStart // Lấy vị trí con trỏ
            val oldText = screen.text.toString() // Lấy nội dung hiện tại

            // Chèn số '3' vào vị trí con trỏ
            val newText = oldText.substring(0, cursorPos) + "9" + oldText.substring(cursorPos)

            screen.setText(newText)  // setText() chấp nhận String
            screen.setSelection(cursorPos + 1) // Đưa con trỏ về đúng vị trí sau số vừa chèn
        }

        button0.setOnClickListener {
            val cursorPos = screen.selectionStart // Lấy vị trí con trỏ
            val oldText = screen.text.toString() // Lấy nội dung hiện tại

            // Chèn số '3' vào vị trí con trỏ
            val newText = oldText.substring(0, cursorPos) + "0" + oldText.substring(cursorPos)

            screen.setText(newText)  // setText() chấp nhận String
            screen.setSelection(cursorPos + 1) // Đưa con trỏ về đúng vị trí sau số vừa chèn
        }

        buttonCong.setOnClickListener {
            val cursorPos = screen.selectionStart // Lấy vị trí con trỏ
            val oldText = screen.text.toString() // Lấy nội dung hiện tại

            // Chèn số '3' vào vị trí con trỏ
            val newText = oldText.substring(0, cursorPos) + "+" + oldText.substring(cursorPos)

            screen.setText(newText)  // setText() chấp nhận String
            screen.setSelection(cursorPos + 1) // Đưa con trỏ về đúng vị trí sau số vừa chèn
        }

        buttonTru.setOnClickListener {
            val cursorPos = screen.selectionStart // Lấy vị trí con trỏ
            val oldText = screen.text.toString() // Lấy nội dung hiện tại

            // Chèn số '3' vào vị trí con trỏ
            val newText = oldText.substring(0, cursorPos) + "-" + oldText.substring(cursorPos)

            screen.setText(newText)  // setText() chấp nhận String
            screen.setSelection(cursorPos + 1) // Đưa con trỏ về đúng vị trí sau số vừa chèn
        }

        buttonNhan.setOnClickListener {
            val cursorPos = screen.selectionStart // Lấy vị trí con trỏ
            val oldText = screen.text.toString() // Lấy nội dung hiện tại

            // Chèn số '3' vào vị trí con trỏ
            val newText = oldText.substring(0, cursorPos) + "x" + oldText.substring(cursorPos)

            screen.setText(newText)  // setText() chấp nhận String
            screen.setSelection(cursorPos + 1) // Đưa con trỏ về đúng vị trí sau số vừa chèn
        }

        buttonChia.setOnClickListener {
            val cursorPos = screen.selectionStart // Lấy vị trí con trỏ
            val oldText = screen.text.toString() // Lấy nội dung hiện tại

            // Chèn số '3' vào vị trí con trỏ
            val newText = oldText.substring(0, cursorPos) + "/" + oldText.substring(cursorPos)

            screen.setText(newText)  // setText() chấp nhận String
            screen.setSelection(cursorPos + 1) // Đưa con trỏ về đúng vị trí sau số vừa chèn
        }

        buttonDot.setOnClickListener {
            val cursorPos = screen.selectionStart
            val oldText = screen.text.toString()
            val newText = oldText.substring(0,cursorPos) + "." + oldText.substring(cursorPos)
            screen.setText(newText)
            screen.setSelection(cursorPos + 1)
        }

        buttonNgoacDong.setOnClickListener {
            val cursorPos = screen.selectionStart // Lấy vị trí con trỏ
            val oldText = screen.text.toString() // Lấy nội dung hiện tại

            // Chèn số '3' vào vị trí con trỏ
            val newText = oldText.substring(0, cursorPos) + ")" + oldText.substring(cursorPos)

            screen.setText(newText)  // setText() chấp nhận String
            screen.setSelection(cursorPos + 1) // Đưa con trỏ về đúng vị trí sau số vừa chèn
        }

        buttonNgoacMo.setOnClickListener {
            val cursorPos = screen.selectionStart // Lấy vị trí con trỏ
            val oldText = screen.text.toString() // Lấy nội dung hiện tại

            // Chèn số '3' vào vị trí con trỏ
            val newText = oldText.substring(0, cursorPos) + "(" + oldText.substring(cursorPos)

            screen.setText(newText)  // setText() chấp nhận String
            screen.setSelection(cursorPos + 1) // Đưa con trỏ về đúng vị trí sau số vừa chèn
        }

        buttonC.setOnClickListener {
            screen.setText("")
        }

        buttonCE.setOnClickListener {
            val cursorPos = screen.selectionStart
            val text = screen.text.toString()

            if (text.isNotEmpty() && cursorPos > 0) {
                val newText = text.substring(0, cursorPos - 1) + text.substring(cursorPos)
                screen.setText(newText)

                // Đưa con trỏ về đúng vị trí sau khi xóa
                screen.setSelection(cursorPos - 1)
            }
        }


        buttonBang.setOnClickListener {
            val text = screen.text.toString().trim()
            if (text.isEmpty()) return@setOnClickListener

            var operatorIndex = -1
            var operator: Char? = null

            // Nếu số hạng đầu tiên là số âm, tìm toán tử từ index 1 trở đi
            val startIndex = if (text[0] == '-') 1 else 0

            for (index in startIndex until text.length) {
                if (text[index] in listOf('+', '-', 'x', '/')) {
                    operatorIndex = index
                    operator = text[index]
                    break
                }
            }

            // Nếu không tìm thấy toán tử => không làm gì cả
            if (operatorIndex == -1 || operator == null) return@setOnClickListener

            // Lấy hai toán hạng (đảm bảo toán hạng đầu tiên vẫn là số âm nếu cần)
            val soHang1 = text.substring(0, operatorIndex).toDoubleOrNull()
            val soHang2 = text.substring(operatorIndex + 1).toDoubleOrNull()

            // Nếu có lỗi chuyển đổi số => không làm gì cả
            if (soHang1 == null || soHang2 == null) return@setOnClickListener

            // Tính toán kết quả
            val result = when (operator) {
                '+' -> soHang1 + soHang2
                '-' -> soHang1 - soHang2
                'x' -> soHang1 * soHang2
                '/' -> if (soHang2 != 0.0) soHang1 / soHang2 else null
                else -> null
            }

            // Nếu có lỗi chia cho 0 => không làm gì cả
            if (result == null) return@setOnClickListener

            // Hiển thị kết quả: nếu là số nguyên, hiển thị không có dấu thập phân
            val formattedResult = if (result % 1 == 0.0) result.toInt().toString() else result.toString()
            screen.setText(formattedResult)
            screen.setSelection(screen.text.length)
        }

    }
}

