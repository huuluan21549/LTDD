package oltest.appmt.exmt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // gọi các đối tượng layout
    Button N1, N2, N3, N4, N5, N6, N7, N8, N9, N0;
    Button btnCong, btnTru, btnNhan, btnChia, btnDot, btnClear, btnKQ;
    TextView tvResult;
    Double var1, var2, ans;
    Boolean cong = false, tru = false, nhan = false, chia = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //tìm điều khiển chứa dữ liệu
        N0 = (Button) findViewById(R.id.N0); //
        N1 = (Button) findViewById(R.id.N1);
        N2 = (Button) findViewById(R.id.N2);
        N3 = (Button) findViewById(R.id.N3);
        N4 = (Button) findViewById(R.id.N4);
        N5 = (Button) findViewById(R.id.N5);
        N6 = (Button) findViewById(R.id.N6);
        N7 = (Button) findViewById(R.id.N7);
        N8 = (Button) findViewById(R.id.N8);
        N9 = (Button) findViewById(R.id.N9);
        btnDot = (Button) findViewById(R.id.btnDot);

        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);

        btnClear = (Button) findViewById(R.id.btnClear);
        btnKQ = (Button) findViewById(R.id.btnKQ);
        tvResult = findViewById(R.id.tv_result);

        //viết các sự kiện cho các thay đổi trên layout.

        //khi nhấn vào nút thì sẽ hiển thị lên màn hình textview
        N0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //khi ấn vào một button thì lấy giá trị có trên textView và + thêm giá trị trong ""
                tvResult.setText(tvResult.getText() + "0");
            }
        });

        //to show value of this button in textView
        N1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "1");
            }
        });

        //to show value of this button in textView
        N2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "2");
            }
        });

        //to show value of this button in textView
        N3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "3");
            }
        });

        //to show value of this button in textView
        N4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "4");
            }
        });

        //to show value of this button in textView
        N5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "5");
            }
        });

        //to show value of this button in textView
        N6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "6");
            }
        });

        //to show value of this button in textView
        N7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "7");
            }
        });

        //to show value of this button in textView
        N8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "8");
            }
        });

        //to show value of this button in textView
        N9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "9");
            }
        });

        //viết các sự kiện cho các button toán tử.

        //btnCong
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1(); //gọi hàm lấy giá trị trên textView gán vào một biến
                buttonFalse(); // enable các button toán tử đi
                cong = true; //đưa trạng thái button cộng về true là đang được chọn
                tru = false; //và ngược lại các button khác về false
                nhan = false;
                chia = false;
            }
        });

        //btnTru
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                buttonFalse();
                cong = false;
                tru = true;
                nhan = false;
                chia = false;
            }
        });

        //btnNhan
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                buttonFalse();
                cong = false;
                tru = false;
                nhan = true;
                chia = false;
            }
        });

        //btnChia
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                buttonFalse();
                cong = false;
                tru = false;
                nhan = false;
                chia = true;
            }
        });

        //btnBang
        btnKQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //lấy giá trị trên màn hình textView gán vào var2 (giá trị được nhập sau toán tử)
                var2 = Double.parseDouble(tvResult.getText().toString());
                //kiểm tra nếu trạng thái toán tử nào được kích hoạt thì thực hiện phép tính tương ứng
                if(cong){
                    ans = var1 + var2;
                } else if (tru){
                    ans = var1 - var2;
                } else if (nhan){
                    ans = var1 * var2;
                } else if (chia){
                    ans = var1 / var2;
                } else {
                    ans = ans + 0;
                }
                //gán kết quả tinh được lên màn hình textView
                tvResult.setText(ans.toString());
                btnKQ.setEnabled(false);

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //enable các button toán tử
                btnKQ.setEnabled(true);
                btnCong.setEnabled(true);
                btnTru.setEnabled(true);
                btnNhan.setEnabled(true);
                btnChia.setEnabled(true);
                //xóa màn hinh
                tvResult.setText("");
            }
        });

    }

    //Sau khi đã viết các sự kiện cho các button số, thì tiếp tục viết các sự kiện cho các button toán tử.

    //Với thuật toán, khi ấn vào một button toán tử thì giá trị trên màn hình đang có sẽ được lưu vào một biến dữ liệu,
    //và xóa màn hình đi để người dùng nhập các số để tính toán với toán tử được chọn
    //và các button toán tử lúc này sẽ bị hủy enable.
    //lấy giá trị hiện có trên màn hình để gán vào một biến
    public void setVar1(){
        var1 = Double.parseDouble(tvResult.getText().toString()); // chuyển sang kiểu dữ liệu là double để tính toán
    }

    //Để có thể hủy enable các button
    //enable các button toán tử và xóa màn hình textView
    public void buttonFalse() {
        btnCong.setEnabled(false);
        btnTru.setEnabled(false);
        btnNhan.setEnabled(false);
        btnChia.setEnabled(false);
        tvResult.setText("");
    }


//    //to change button color
//    public void colorChange(Button b) {
//        b.setBackgroundColor(getResources().getColor(R.color.startColor_ActionBar));
//    }

}