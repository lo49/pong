# ------------ Package du projet -----------
packages = struct ihm main
# ------------ Options du projet -----------
TARGET=Appli
# ------------ Emplacement des fichiers sources -----------
SOURCE_PATH=src/
# ------------ Emplacement des fichiers class -----------
CLASS_PATH=class/
# ------------ Emplacement des fichiers de la documentation -----------
DOC_PATH=doc/
# ------------ Compilateur -----------
COMPIL=javac
# ------------ Exécution -----------
EXEC=java
# ------------ Génération de la documentation JavaDoc -----------
DOC=javadoc
# ----- Compilation par defaut des source java

all : $(packages)

$(packages):
	$(COMPIL) $(SOURCE_PATH)$@/*.java -d $(CLASS_PATH) -cp "$(CLASS_PATH):$(SOURCE_PATH)"
	
run:
	$(EXEC) -classpath $(CLASS_PATH) main.$(TARGET) $(IMAGE)

doc:
	@echo "generation de la documentation JavaDoc ..."
	$(DOC) -d $(DOC_PATH) $(SOURCE_PATH)*/*.java

clean:
	rm -f $(CLASS_PATH)*/*.class 
	rm -f $(SOURCE_PATH)*/*.java~
	rm -rf $(DOC_PATH)*
	#rmdir $(DOC_PATH)

	
