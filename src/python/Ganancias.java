
package python;

import psycopg2
import pandas as pd
import matplotlib.pyplot as plt

def conexion():
    try:
        conn = psycopg2.connect(
            host="localhost",
            user="postgres",     
            password="12345",    
            database="aventurerosbda",
            port="5432"
        )
        print("Conexión exitosa a PostgreSQL")
        return conn
    except Exception as e:
        print("Error al conectar:", e)
        return None


def obtener_ganancias():
    conn = conexion()
    if conn is None:
        return None

    query = """
        SELECT 
            fecha_servicio,
            SUM(valor_servicio) AS total_ganado
        FROM Servicio
        GROUP BY fecha_servicio
        ORDER BY fecha_servicio;
    """

    df = pd.read_sql(query, conn)
    conn.close()
    return df


def generar_grafica():
    df = obtener_ganancias()
    if df is None or df.empty:
        print("No hay datos para graficar.")
        return

    plt.figure(figsize=(10, 5))
    plt.plot(df["fecha_servicio"], df["total_ganado"], marker="o")
    plt.title("Ganancias por Día - AventurerosBDA")
    plt.xlabel("Fecha del Servicio")
    plt.ylabel("Total Ganado ($)")
    plt.grid(True)

    nombre_archivo = "ganancias.png"
    plt.savefig(nombre_archivo, dpi=300)
    print(f"Gráfica guardada como: {nombre_archivo}")

    plt.show()


if __name__ == "__main__":
    generar_grafica()
