package com.yeapin.file;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * 文件操作 
 * -创建文件 
 * -判断是否存在 
 * -获取文件路径 
 * -创建目录 
 * -删除文件 
 * -修改文件名 
 * 
 * @author Jet
 *
 */
public class FileUtil {
	/**
	 * 创建文件
	 * 
	 * @param filePath
	 * @throws IOException
	 */
	public void createFile(String filePath) throws IOException {
		File file = new File(filePath);
		// 判断文件是否存在
		if (!file.exists()) {
			// 创建文件
			file.createNewFile();
		}
		// 文件名
		String name = file.getName();
		// 文件路径
		String path = file.getPath();
		// 绝对路径
		String absPath = file.getAbsolutePath();
		// 上级路径
		String parentPath = file.getParent();
		// 文件大小
		long size = file.length();
		// 最后修改时间
		long time = file.lastModified();
		// 阳历时间
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println(name);
		System.out.println(path);
		System.out.println(absPath);
		System.out.println(parentPath);
		System.out.println(size);
		System.out.println(calendar.getTime());
		calendar.setTimeInMillis(time);
		// HH为24小时制，hh为12小时制
		SimpleDateFormat sft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sft.format(calendar.getTime()));
		// 删除文件
//		file.delete();

	}

	/**
	 * 创建目录
	 * 
	 * @param dirPath
	 */
	public void createDirs(String dirPath) {
		File file = new File(dirPath);
		if (!file.exists()) {
			file.mkdirs();
		}
		System.out.println(file.getAbsolutePath());
//		deleteDirs("/a");
	}
	/**
	 * 删除整个目录
	 * @param dirPath
	 * @return
	 */
	public boolean deleteDirs(String dirPath) {
		//为目录最后加上分隔符
		if (!dirPath.endsWith(File.separator)) {
			dirPath = dirPath + File.separator;
		}
		File dirFile = new File(dirPath);
		if (!dirFile.exists() || !dirFile.isDirectory()) {
			return false;
		}
		//该目录下全部文件（含目录）
		File[] files = dirFile.listFiles();
		for (File file : files) {
			//是文件删文件，是目录递归调用
			if (file.isFile()) {
				file.delete();
			} else {
				deleteDirs(file.getAbsolutePath());
			}
		}
		//删除当前目录
		dirFile.delete();
		return true;
	}
	/**
	 * 重命名文件
	 * @param fromPath
	 * @param toPath
	 */
	public void renameFile(String fromPath,String toPath){
		File file1 = new File(fromPath);
		File file2 = new File(toPath);
		if(!file2.exists()){
			new File(file2.getParent()).mkdirs();
		}
		file1.renameTo(file2);
	}
}
