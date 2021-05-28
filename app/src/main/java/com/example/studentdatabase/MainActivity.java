package com.example.studentdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements android.view.View.OnClickListener
{

    EditText eid,ename,edob,eaddress,eadmission,edepartment,ecourse,emobno,essc,ehsc,emhcet,ejee,esem1,esem2,esem3,esem4,esem5,esem6,esem7,esem8;
    Button Insert,Delete,Update,Search,Viewall;
    SQLiteDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eid = (EditText)findViewById(R.id.aI1);
        ename = (EditText)findViewById(R.id.N);
        edob = (EditText)findViewById(R.id.D);
        eaddress = (EditText)findViewById(R.id.A);
        eadmission = (EditText)findViewById(R.id.Y);
        edepartment = (EditText)findViewById(R.id.DP);
        ecourse = (EditText)findViewById(R.id.C);
        emobno = (EditText)findViewById(R.id.M);
        essc = (EditText)findViewById(R.id.SC);
        ehsc = (EditText)findViewById(R.id.HC);
        emhcet = (EditText)findViewById(R.id.MC);
        ejee = (EditText)findViewById(R.id.JE);
        esem1 = (EditText)findViewById(R.id.S1);
        esem2 = (EditText)findViewById(R.id.S2);
        esem3 = (EditText)findViewById(R.id.S3);
        esem4 = (EditText)findViewById(R.id.S4);
        esem5 = (EditText)findViewById(R.id.S5);
        esem6 = (EditText)findViewById(R.id.S6);
        esem7 = (EditText)findViewById(R.id.S7);
        esem8 = (EditText)findViewById(R.id.S8);
        Insert = (Button)findViewById(R.id.ainsert);
        Delete = (Button)findViewById(R.id.adelete);
        Update =(Button)findViewById(R.id.aupdate);
        Search = (Button)findViewById(R.id.asearch);
        Viewall = (Button)findViewById(R.id.aviewall);

        Insert.setOnClickListener(this);
        Delete.setOnClickListener(this);
        Update.setOnClickListener(this);
        Search.setOnClickListener(this);
        Viewall.setOnClickListener(this);


        db=openOrCreateDatabase("StudentDB", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS student(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, DOB TEXT, ADDRESS TEXT, ADMISSION_YEAR TEXT, DEPARTMENT TEXT, COURSE TEXT, MOB_NO INTEGER, SSC INTEGER, HSC INTEGER, MH_CET INTEGER, JEE INTEGER, SEM1 INTEGER, SEM2 INTEGER, SEM3 INTEGER, SEM4 INTEGER, SEM5 INTEGER, SEM6 INTEGER, SEM7 INTEGER, SEM8 INTEGER)");
    }


    public void onClick(View view)
    {

        if(view==Insert)
        {

            if(eid.getText().toString().trim().length()==0||
                    ename.getText().toString().trim().length()==0||
                    edob.getText().toString().trim().length()==0||
                    eaddress.getText().toString().trim().length()==0||
                    eadmission.getText().toString().trim().length()==0||
                    edepartment.getText().toString().trim().length()==0||
                    ecourse.getText().toString().trim().length()==0||
                    emobno.getText().toString().trim().length()==0||
                    essc.getText().toString().trim().length()==0||
                    ehsc.getText().toString().trim().length()==0||
                    emhcet.getText().toString().trim().length()==0||
                    ejee.getText().toString().trim().length()==0||
                    esem1.getText().toString().trim().length()==0||
                    esem2.getText().toString().trim().length()==0||
                    esem3.getText().toString().trim().length()==0||
                    esem4.getText().toString().trim().length()==0||
                    esem5.getText().toString().trim().length()==0||
                    esem6.getText().toString().trim().length()==0||
                    esem7.getText().toString().trim().length()==0||
                    esem8.getText().toString().trim().length()==0)
            {
                showMessage("Error", "Please Enter All Values");
                return;
            }

            Float sc,hc,e1,e2,e3,e4,e5,e6,e7,e8;
            int me,je;
            sc=Float.parseFloat(essc.getText().toString());
            hc=Float.parseFloat(ehsc.getText().toString());
            me=Integer.parseInt(emhcet.getText().toString());
            je=Integer.parseInt(ejee.getText().toString());
            e1=Float.parseFloat(esem1.getText().toString());
            e2=Float.parseFloat(esem2.getText().toString());
            e3=Float.parseFloat(esem3.getText().toString());
            e4=Float.parseFloat(esem4.getText().toString());
            e5=Float.parseFloat(esem5.getText().toString());
            e6=Float.parseFloat(esem6.getText().toString());
            e7=Float.parseFloat(esem7.getText().toString());
            e8=Float.parseFloat(esem8.getText().toString());

            if (sc >=00.00 && sc <=100.00) {
                if (hc >=00.00 && hc <=100.00) {
                    if (me >= 00.00 && me <= 200.00) {
                        if (je >= 00.00 && je <= 300.00) {
                            if (e1 >= 00.00 && e1 <= 10.00) {
                                if (e2 >= 00.00 && e2 <= 10.00) {
                                    if (e3 >= 00.00 && e3 <= 10.00) {
                                        if (e4 >= 00.00 && e4 <= 10.00) {
                                            if (e5 >= 00.00 && e5 <= 10.00) {
                                                if (e6 >= 00.00 && e6 <= 10.00) {
                                                    if (e7 >= 00.00 && e7 <= 10.00) {
                                                        if (e8 >= 00.00 && e8 <= 10.00) {
                                                            try {
                                                                db.execSQL("INSERT INTO student VALUES('"+ eid.getText()+"','" + ename.getText() + "','" + edob.getText() + "','" + eaddress.getText() + "','" + eadmission.getText() + "','" + edepartment.getText() + "','" + ecourse.getText() + "','" + emobno.getText() + "','" + essc.getText() + "','" + ehsc.getText() + "','" + emhcet.getText() + "','" + ejee.getText() + "','" + esem1.getText() + "','" + esem2.getText() + "','" + esem3.getText() + "','" + esem4.getText() + "','" + esem5.getText() + "','" + esem6.getText() + "','" + esem7.getText() + "','" + esem8.getText() + "');");

                                                                showMessage("Successful", "Record Added To Database");
                                                                clearText();
                                                            } catch (Exception e) {
                                                                Toast.makeText(getApplicationContext(), "There Was An Error In Your Input!!", Toast.LENGTH_SHORT).show();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else{
                essc.setText("");
                ehsc.setText("");
                emhcet.setText("");
                ejee.setText("");
                esem1.setText("");
                esem2.setText("");
                esem3.setText("");
                esem4.setText("");
                esem5.setText("");
                esem6.setText("");
                esem7.setText("");
                esem8.setText("");
                Toast.makeText(getApplicationContext(), "Please Enter Proper Academic Details", Toast.LENGTH_LONG).show();
            }

        }






        if(view==Delete)
        {

            if(eid.getText().toString().trim().length()==0)
            {
                showMessage("Error", "Please enter ID");
                return;
            }
            Cursor c=db.rawQuery("SELECT * FROM student WHERE ID='"+eid.getText()+"'", null);
            if(c.moveToFirst())
            {
                db.execSQL("DELETE FROM student WHERE ID='"+eid.getText()+"'");
                showMessage("Successful", "Record Deleted From Database");
            }
            else
            {
                showMessage("Error", "Invalid ID!!");
            }
            clearText();
        }



        if(view==Update)
        {

            if(eid.getText().toString().trim().length()==0)
            {
                showMessage("Error", "Please enter ID");
                return;
            }
            Cursor c=db.rawQuery("SELECT * FROM student WHERE ID='"+eid.getText()+"'", null);
            if(c.moveToFirst()) {
                db.execSQL("UPDATE student SET NAME='" + ename.getText() + "',DOB='" + edob.getText() + "',ADDRESS='" + eaddress.getText() + "',ADMISSION_YEAR='" + eadmission.getText() + "',DEPARTMENT='" + edepartment.getText() + "',COURSE='" + ecourse.getText() + "',MOB_NO='" + emobno.getText() + "',SSC='" + essc.getText() + "',HSC='" + ehsc.getText() + "',MH_CET='" + emhcet.getText() + "',JEE='" + ejee.getText() + "',SEM1='" + esem1.getText() + "',SEM2='" + esem2.getText() + "',SEM3='" + esem3.getText() + "',SEM4='" + esem4.getText() + "',SEM5='" + esem5.getText() + "',SEM6='" + esem6.getText() + "',SEM7='" + esem7.getText() + "',SEM8='" + esem8.getText() + "'" );
                showMessage("Successful", "Record Updated In Database");
            }
            else {
                showMessage("Error", "Invalid ID!!");
            }
            clearText();
        }



        if(view==Search)
        {
            if(eid.getText().toString().trim().length()==0)
            {
                showMessage("Error", "Please enter ID");
                return;
            }
            Cursor c=db.rawQuery("SELECT * FROM student WHERE ID='"+eid.getText()+"'", null);
            if(c.moveToFirst())
            {
                ename.setText(c.getString(1));
                edob.setText(c.getString(2));
                eaddress.setText(c.getString(3));
                eadmission.setText(c.getString(4));
                edepartment.setText(c.getString(5));
                ecourse.setText(c.getString(6));
                emobno.setText(c.getString(7));
                essc.setText(c.getString(8));
                ehsc.setText(c.getString(9));
                emhcet.setText(c.getString(10));
                ejee.setText(c.getString(11));
                esem1.setText(c.getString(12));
                esem2.setText(c.getString(13));
                esem3.setText(c.getString(14));
                esem4.setText(c.getString(15));
                esem5.setText(c.getString(16));
                esem6.setText(c.getString(17));
                esem7.setText(c.getString(18));
                esem8.setText(c.getString(19));

            }
            else
            {
                showMessage("Error", "Invalid ID");
                clearText();
            }
        }





        if(view==Viewall)
        {
            Cursor c=db.rawQuery("SELECT * FROM student order by ID DESC", null);
            if(c.getCount()==0)
            {
                showMessage("Error", "No records found");
                return;
            }


            StringBuffer buffer=new StringBuffer();
            while(c.moveToNext())
            {

                buffer.append("ID:"+c.getString(0)+"\n");
                buffer.append("NAME:"+c.getString(1)+"\n");
                buffer.append("D.O.B.:"+c.getString(2)+"\n");
                buffer.append("ADDRESS:"+c.getString(3)+"\n");
                buffer.append("ADMISSION YEAR:"+c.getString(4)+"\n");
                buffer.append("DEPARTMENT:"+c.getString(5)+"\n");
                buffer.append("COURSE:"+c.getString(6)+"\n");
                buffer.append("MOB.NO.:"+c.getString(7)+"\n");
                buffer.append("S.S.C.:"+c.getString(8)+"\n");
                buffer.append("H.S.C.:"+c.getString(9)+"\n");
                buffer.append("MH-CET:"+c.getString(10)+"\n");
                buffer.append("JEE:"+c.getString(11)+"\n");
                buffer.append("SEM1:"+c.getString(12)+"\n");
                buffer.append("SEM2:"+c.getString(13)+"\n");
                buffer.append("SEM3:"+c.getString(14)+"\n");
                buffer.append("SEM4:"+c.getString(15)+"\n");
                buffer.append("SEM5:"+c.getString(16)+"\n");
                buffer.append("SEM6:"+c.getString(17)+"\n");
                buffer.append("SEM7:"+c.getString(18)+"\n");
                buffer.append("SEM8:"+c.getString(19)+"\n");
            }
            showMessage("Student Details", buffer.toString());
        }
    }



    public void showMessage(String title,String message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }



    public void clearText()
    {
        eid.setText("");
        ename.setText("");
        edob.setText("");
        eaddress.setText("");
        eadmission.setText("");
        ecourse.setText("");
        edepartment.setText("");
        emobno.setText("");
        essc.setText("");
        ehsc.setText("");
        emhcet.setText("");
        ejee.setText("");
        esem1.setText("");
        esem2.setText("");
        esem3.setText("");
        esem4.setText("");
        esem5.setText("");
        esem6.setText("");
        esem7.setText("");
        esem8.setText("");
        eid.requestFocus();
    }
}
