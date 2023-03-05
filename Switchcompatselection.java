private SwitchCompat switch1, switch2, switch3;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_appointment_booking2);

    imgBack = findViewById(R.id.imgBackAppointment);
    confirmBtn = findViewById(R.id.confirm_btn);

    confirmDialog = new Dialog(this);
    customDialog = new Dialog(this);

    switch1 = findViewById(R.id.one);
    switch2 = findViewById(R.id.two);
    switch3 = findViewById(R.id.three);

    switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked) {
                // Turn off other switches
                switch2.setChecked(false);
                switch3.setChecked(false);
            }
        }
    });

    switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked) {
                // Turn off other switches
                switch1.setChecked(false);
                switch3.setChecked(false);
            }
        }
    });

    switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked) {
                // Turn off other switches
                switch1.setChecked(false);
                switch2.setChecked(false);
            }
        }
    });
