package com.example.lab17_lisinstanislav_4194;

import android.app.Activity;

public class main extends Activity {
    protected String s1, s2;

    public String getS1() { return s1; }
    public String getS2() { return s2; }

    public void setS1(String s1) { this.s1 = s1; }
    public void setS2(String s2) { this.s2 = s2; }

    public main()
    {
        super();

        s1 = "Строка 1";
        s2 = "Строка 2";
    }
}
