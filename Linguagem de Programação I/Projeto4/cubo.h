class Cubo {
    private:
        double m_aresta;  
        static int total; 
        
    public:
        Cubo(double aresta);

        void setCubo(double aresta);

        static int getTotal();

        double getAresta();
        double area();
        double volume();

};