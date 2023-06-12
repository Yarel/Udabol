import requests

def download_json_from_api():
    url = 'https://200.105.154.18:5901/api/Alumnos/38330'

    response = requests.get(url, verify=False )
    if response.status_code == 200:
        json_data = response.json()
        return json_data
    else:
        print(f"Error al descargar JSON de la API. Código de estado: {response.status_code}")
        return None

# Descargar el JSON de la API
json_data = download_json_from_api()

# Verificar si se pudo descargar correctamente
if json_data is not None:
    # Aquí puedes realizar operaciones con los datos JSON cargados
    print(json_data)

