TextView t1 =  findViewById(R.id.textview);
        registerForContextMenu(t1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.m,menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        ConstraintLayout cl = findViewById(R.id.cl);
        if (item.getItemId() == R.id.red) {
            cl.setBackgroundColor(Color.RED);
        } else if (item.getItemId() == R.id.blue) {
            cl.setBackgroundColor(Color.BLUE);
        } else if (item.getItemId() == R.id.green) {
            cl.setBackgroundColor(Color.GREEN);
        }
        return super.onContextItemSelected(item);

    }

}
