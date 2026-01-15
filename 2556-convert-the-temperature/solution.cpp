class Solution {
public:
    vector<double> convertTemperature(double celsius) {
        double f = celsius * 1.8 + 32.0;
        double k = celsius + 273.15;

        
        vector<double> arr(2);
        arr[0] = k;
        arr[1] = f;
        return arr;
    }
};
