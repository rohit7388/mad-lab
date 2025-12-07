EditText f=findViewById(R.id.t1);
        EditText s=findViewById(R.id.t2);
        TextView result=findViewById(R.id.t3);
        Button btn1=findViewById(R.id.button1);
        Button btn2=findViewById(R.id.button2);
        Button btn3=findViewById(R.id.button3);
        Button btn4=findViewById(R.id.button4);
        Button clear=findViewById(R.id.button5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editing1=f.getText().toString();
                String editing2=s.getText().toString();
                int n1=Integer.parseInt(editing1);
                int n2=Integer.parseInt(editing2);
                int sum=n1+n2;
                result.setText("Sum is "+sum);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editing1=f.getText().toString();
                String editing2=s.getText().toString();
                int n1=Integer.parseInt(editing1);
                int n2=Integer.parseInt(editing2);
                int diA=n1-n2;
                result.setText("DiAerence is "+diA);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editing1=f.getText().toString();
                String editing2=s.getText().toString();
                int n1=Integer.parseInt(editing1);
                int n2=Integer.parseInt(editing2);
                int prod=n1*n2;
                result.setText("Product is "+prod);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editing1=f.getText().toString();
                String editing2=s.getText().toString();
                int n1=Integer.parseInt(editing1);
                int n2=Integer.parseInt(editing2);
                int q=n1/n2;
                result.setText("Quotient is "+q);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f.setText("0");
                s.setText("0");
                result.setText("0");
                Random r=new Random();
            }
        });
    }
}
