package com.univaq.mobile.unicookserver.domain;

import javax.persistence.*;

@Entity
@Table(name = "photos")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PHOTO", nullable = false)
    private Long id;

    @Column(name = "FILEPATH")
    private String filepath;

    @Column(name = "WEBVIEWPATH", nullable = false)
    private String webviewpath;

    @Column(name = "BASE64")
    private String base64;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getWebviewpath() {
        return webviewpath;
    }

    public void setWebviewpath(String webviewpath) {
        this.webviewpath = webviewpath;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }
}
