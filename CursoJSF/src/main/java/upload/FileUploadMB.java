/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upload;

import java.io.File;
import java.io.FileOutputStream;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Moises
 */
@ManagedBean(name = "fileUploadMB")
@RequestScoped
public class FileUploadMB {

    public FileUploadMB() {
    }

    public void doUpload(FileUploadEvent fileUploadEvent) {
        UploadedFile uploadedFile = fileUploadEvent.getFile();
        String fileNameUploaded = uploadedFile.getFileName();
        long fileSizeUploaded = uploadedFile.getSize();
        String infoAboutFile = "<br/> Arquivo recebido: <b>"
                + fileNameUploaded + "</b><br/>" + "Tamanho do Arquivo: <b>"
                + fileSizeUploaded + "</b>";
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage(null, new FacesMessage("Sucesso", infoAboutFile));

    }

    public void fileUploadAction(FileUploadEvent event) {
        try {
            ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
            HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();

            FacesContext aFacesContext = FacesContext.getCurrentInstance();
            ServletContext context = (ServletContext) aFacesContext.getExternalContext().getContext();

            String realPath = context.getRealPath("//");

// Aqui cria o diretorio caso não exista 
            File file = new File(realPath + "/fotos/");
            file.mkdirs();
             System.err.println(file.getAbsolutePath());
            byte[] arquivo = event.getFile().getContents();
            String caminho = realPath + "/fotos/" + event.getFile().getFileName();

// esse trecho grava o arquivo no diretório 
            FileOutputStream fos = new FileOutputStream(caminho);
            fos.write(arquivo);
            fos.close();

        } catch (Exception ex) {
            System.out.println("Erro no upload de imagem" + ex);
        }
    }

//Leia mais em: Upload de arquivos com PrimeFaces http://www.devmedia.com.br/upload-de-arquivos-com-primefaces/26690#ixzz3LteAUBso
}
