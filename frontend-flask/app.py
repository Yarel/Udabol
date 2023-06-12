from flask import Flask, render_template, request
import requests

app = Flask(__name__)

def download_json_from_api(user_id):
    url = f'https://200.105.154.18:5901/api/Alumnos/{user_id}'

    response = requests.get(url, verify=False)
    if response.status_code == 200:
        json_data = response.json()
        return json_data
    else:
        print(f"Error al descargar JSON de la API. Código de estado: {response.status_code}")
        return None

@app.route('/', methods=['GET', 'POST'])
def show_json_data():
    if request.method == 'POST':
        user_id = request.form['id_input']
        json_data = download_json_from_api(user_id)
        return render_template('./index.html', json_data=json_data)
    else:
        return render_template('./index.html')

if __name__ == '__main__':
    app.run()

