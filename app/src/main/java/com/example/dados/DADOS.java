package com.example.dados;

public class DADOS {
    protected void  onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        private ImageView diceImageView;
        private Button rollButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            diceImageView = findViewById(R.id.diceImageView);
            rollButton = findViewById(R.id.rollButton);

            // Establecer un listener para el botón de lanzamiento
            rollButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    lanzarDado();
                }
            });
        }

        private void lanzarDado() {
            // Generar un número aleatorio entre 1 y 6
            Random random = new Random();
            int resultadoDado = random.nextInt(6) + 1;

            // Obtener el recurso de la imagen correspondiente al resultado del dado
            int imagenId = obtenerImagenId(resultadoDado);

            // Establecer la imagen en el ImageView
            diceImageView.setImageResource(imagenId);
        }

        private int obtenerImagenId(int numeroDado) {
            // Determinar el recurso de la imagen según el número del dado
            switch (numeroDado) {
                case 1:
                    return R.drawable.dado_1;
                case 2:
                    return R.drawable.dado_2;
                case 3:
                    return R.drawable.dado_3;
                case 4:
                    return R.drawable.dado_4;
                case 5:
                    return R.drawable.dado_5;
                case 6:
                    return R.drawable.dado_6;
                default:
                    return R.drawable.dado_1; // En caso de un valor no esperado, mostrar la cara del dado 1
            }
        }
