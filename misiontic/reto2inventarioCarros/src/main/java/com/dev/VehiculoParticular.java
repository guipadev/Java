package com.dev;
public class VehiculoParticular  extends Vehiculo{

        private String Color;

        public VehiculoParticular() {
            super();
            Color = "";
        }

        public VehiculoParticular(String Color, int velocidad, int pasajeros, String placa) {
            super(velocidad, pasajeros, placa);
            this.Color = Color;
        }

        public String getColor() {
            return Color;
        }

        public void setColor(String Color) {
            this.Color = Color;
        }


        @Override
        public String toString() {
            return "\tVehículo Particular - " + super.toString() + "\tColor: " + Color;
        }
}
