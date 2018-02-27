package com.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式 树状结构 模拟杀毒
 */
public interface AbstractFile {
    void  killVirus();//杀毒
}

class ImageFile implements AbstractFile {
    private  String name;
    public ImageFile(String name){
        super();
        this.name = name;
    }

    @Override
    public  void killVirus(){
        System.out.println("图像文件查杀"+name);
    }
}

class TextFile implements AbstractFile {
    private  String name;
    public TextFile(String name){
        super();
        this.name = name;
    }

    @Override
    public  void killVirus(){
        System.out.println("文本文件查杀"+name);
    }
}

class VideoFile implements AbstractFile {
    private  String name;
    public VideoFile(String name){
        super();
        this.name = name;
    }

    @Override
    public  void killVirus(){
        System.out.println("视频文件查杀"+name);
    }
}

class Folder implements AbstractFile {
    private  String name;
    //定义容器，用来存放本容器构建下的子节点
    private List<AbstractFile> list = new ArrayList<AbstractFile>();
    public Folder(String name){
        super();
        this.name = name;
    }

    public  void add(AbstractFile file){
        list.add(file);
    }
    public  void remove(AbstractFile file){
        list.remove(file);
    }
    public AbstractFile add(int  index){
        return list.get(index);
    }


    @Override
    public  void killVirus(){
        System.out.println("文件夹查杀");
        for (AbstractFile file:list){
            file.killVirus();
        }
    }
}