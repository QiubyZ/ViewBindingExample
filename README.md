# ViewBindingExample
Ini Hanya Contoh belajar ViewBinding Android


#ViewBinding
Yang mau minggat ke ViewBinding,
Kalau udah ada ViewBinding, ga perlu lagi untuk semisal

<Button
        android:id="@+id/lompat"
        android:layout_height="wrap_content"
        android:layout_width="wrap_content"/>
    

TextView textview;
textview = findviewById(R.id.lompat);
textview.setText("Oke ini contoh")

tinggal Ambel <namaclass>.<buttonid>.<fungsi>

ActivityMainBinding binding;
binding = ActivityMainBinding.inflate(getLayoutInflater());

setContentView(binding.getRoot());
binding.lompat.setText("Lompat Activity Ke dua");
    

https://github.com/QiubyZ/ViewBindingExample
