from pathlib import Path
import xml.etree.ElementTree as ET

root = Path(__file__).parent
xml_files = list((root / "app/src/main").rglob("*.xml"))
for path in xml_files:
    ET.parse(path)
print(f"XML válidos: {len(xml_files)}")

required = [
    root / "app/src/main/java/com/example/streamflix/MainActivity.java",
    root / "app/src/main/java/com/example/streamflix/MovieAdapter.java",
    root / "app/src/main/res/layout/activity_main.xml",
    root / "app/src/main/res/layout/item_movie.xml",
]
for path in required:
    assert path.exists(), f"Arquivo ausente: {path}"
print("Arquivos essenciais presentes: OK")
