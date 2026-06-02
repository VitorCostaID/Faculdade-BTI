class Paralelepipedo {
    private:
        static int total;
        double m_aresta1, m_aresta2, m_aresta3;
    
    public: 
        Paralelepipedo(double aresta1, double aresta2, double aresta3);

        static int getTotal();   

        double getAresta1();
        double getAresta2();
        double getAresta3();
        double area();
        double volume();

};