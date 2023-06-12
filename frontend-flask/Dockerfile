# Establecer la imagen base
FROM python:3.9-slim-buster

# Establecer el directorio de trabajo en el contenedor
WORKDIR /app

# Copiar los archivos necesarios al contenedor
COPY requirements.txt .
COPY app.py .
COPY templates ./templates

# Instalar las dependencias
RUN pip install --no-cache-dir -r requirements.txt

# Exponer el puerto en el que se ejecutará la aplicación
EXPOSE 5000

# Establecer el comando de inicio del contenedor
CMD [ "python", "app.py" ]

