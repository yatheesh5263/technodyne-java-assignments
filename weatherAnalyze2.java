public class weatherAnalyze2 {

    public static void main(String[] args) {
        double[][][] weatherData = {
            // City 0: New York
            {
                {25.5, 65.0, 2.5},  // January
                {28.0, 68.0, 3.0},  // February
                {32.5, 70.0, 4.5}   // March
            },
            // City 1: Los Angeles
            {
                {28.5, 60.0, 1.5},  // January
                {30.0, 62.0, 1.8},  // February
                {32.0, 65.0, 2.0}   // March
            },
            // City 2: Chicago
            {
                {20.5, 58.0, 2.0},  // January
                {22.0, 60.0, 2.5},  // February
                {26.5, 63.0, 3.5}   // March
            }
        };

        String[] cities = {"New York", "Los Angeles", "Chicago"};

        
        for (int i = 0; i < weatherData.length; i++) {
            double tempSum = 0;
            for (int j = 0; j < weatherData[i].length; j++) {
                tempSum += weatherData[i][j][0];
            }
            double avgTemp = tempSum / weatherData[i].length;  
            System.out.println(cities[i] + ": Average Temperature = " + avgTemp);
        }

      
        maxRainfall(weatherData);
        
    }

    public static void maxRainfall(double[][][] weatherData) {
        double maximumRainfall = weatherData[0][0][2];

        for (int i = 0; i < weatherData.length; i++) {
            for (int j = 0; j < weatherData[i].length; j++) {
                if (weatherData[i][j][2] > maximumRainfall) {
                    maximumRainfall = weatherData[i][j][2];
                }
            }
        }
        System.out.println("Maximum Rainfall is: " + maximumRainfall);
    }

    }
