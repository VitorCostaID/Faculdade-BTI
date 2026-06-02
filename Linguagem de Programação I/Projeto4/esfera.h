class Esfera {
    private:
        double m_raio;
        static int total;
    
    public:
        Esfera(double raio);
    
        void setEsfera(double raio);

        static int getTotal();

        double getRaio();
        double area();
        double volume();

};