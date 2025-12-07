Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.options,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.f1)
        {
            startActivity(new Intent(this,MainActivity2.class));
            return true;
        }
        else if(item.getItemId()==R.id.f2)
        {
            startActivity(new Intent(this,MainActivity3.class));
            return true;
        }
        return super.onOptionsItemSelected(item);


    }
}
