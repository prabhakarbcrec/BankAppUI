package com.example.prabhakarkumarojha.myaccount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Toolbar toolbar;
ListView listView;

    String[] tname={"Name Number","My Wallet","Bank Account",
                    "Saved Cards","Redeem Voucher",
                    "My QR Code","Invite and Earn"
                    ,"Security Settings","Help","Home"};

    Integer[] imgid={R.drawable.name_number,R.drawable.wallet,R.drawable.bank,R.drawable.payment,R.drawable.redeem,
            R.drawable.rq,R.drawable.invite
    ,R.drawable.securrity,R.drawable.help,R.drawable.home};
    Integer[] imgid2={R.drawable.indicator,R.drawable.indicator,R.drawable.indicator,R.drawable.indicator,
            R.drawable.indicator,R.drawable.indicator,R.drawable.indicator,R.drawable.indicator,R.drawable.indicator,
            R.drawable.indicator};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        listView=(ListView)findViewById(R.id.listview);
        costomize cs = new costomize(this, tname, imgid2, imgid);
        listView.setAdapter(cs);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        Toast.makeText(MainActivity.this, "prabhakar kumar ojha,7098080705", Toast.LENGTH_LONG).show();

                        break;

                    case 1:
                        Toast.makeText(MainActivity.this, "wallet", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "bank account", Toast.LENGTH_LONG).show();

                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "saved cards", Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this, "redeem voucher", Toast.LENGTH_LONG).show();

                        break;
                    case 5:
                        Toast.makeText(MainActivity.this, "my qr code", Toast.LENGTH_LONG).show();

                        break;
                    case 6:
                        Toast.makeText(MainActivity.this, "invite and earn", Toast.LENGTH_LONG).show();

                        break;
                    case 7:
                        Toast.makeText(MainActivity.this, "security settings", Toast.LENGTH_LONG).show();
                        break;
                    case 8:
                        Toast.makeText(MainActivity.this, "help", Toast.LENGTH_LONG).show();
                        break;
                    case 9:
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_LONG).show();
                        break;

                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch(id)
        {
            case R.id.sand1:
                Toast.makeText(this,"      sent",Toast.LENGTH_LONG).show();
                break;
            case R.id.noti:
                Toast.makeText(this,"notification is ready",Toast.LENGTH_LONG).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
