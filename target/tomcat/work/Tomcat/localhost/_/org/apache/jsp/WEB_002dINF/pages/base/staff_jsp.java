/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-12-21 06:07:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class staff_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<!-- 导入jquery核心类库 -->\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.8.3.js\"></script>\n");
      out.write("<!-- 导入easyui类库 -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/default/easyui.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/icon.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/portal.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/default.css\">\t\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/jquery.easyui.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/jquery.portal.js\"></script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/jquery.cookie.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/locale/easyui-lang-zh_CN.js\"\n");
      out.write("\ttype=\"text/javascript\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tfunction doAdd(){\n");
      out.write("\t\t$('#name').val('');\n");
      out.write("\t\t$('#telephone').val('');\n");
      out.write("\t\t$('#station').val('');\n");
      out.write("\t\t$('#haspda').removeAttr(\"checked\");\n");
      out.write("\t\t$('#standardId').combobox('setValue', '');\n");
      out.write("\t\t$('#id').val('');\n");
      out.write("\t\t$('#id').removeAttr('readonly');\n");
      out.write("\t\t$('#addStaffWindow').window(\"open\");\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction doView(){\n");
      out.write("\t\talert(\"查看...\");\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction doDelete(){\n");
      out.write("\t\t//判断是否选中\n");
      out.write("\t\tvar array = $('#grid').datagrid('getSelections');\n");
      out.write("\t\tif(array.length == 0) {\n");
      out.write("\t\t\t$.messager.alert('警告','删除前必须选中！','warning');\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\t$('#delForm').form({url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staff_delBatch.action\"}).submit();\n");
      out.write("\t\t\twindow.location.reload();\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction doRestore(){\n");
      out.write("\t\t//判断是否选中\n");
      out.write("\t\tvar array = $('#grid').datagrid('getSelections');\n");
      out.write("\t\tif(array.length == 0) {\n");
      out.write("\t\t\t$.messager.alert('警告','恢复前必须选中！','warning');\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\t$('#delForm').form({url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staff_restore.action\"}).submit();\n");
      out.write("\t\t\twindow.location.reload();\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t//工具栏\n");
      out.write("\tvar toolbar = [ {\n");
      out.write("\t\tid : 'button-view',\t\n");
      out.write("\t\ttext : '查询',\n");
      out.write("\t\ticonCls : 'icon-search',\n");
      out.write("\t\thandler : doView\n");
      out.write("\t}, {\n");
      out.write("\t\tid : 'button-add',\n");
      out.write("\t\ttext : '增加',\n");
      out.write("\t\ticonCls : 'icon-add',\n");
      out.write("\t\thandler : doAdd\n");
      out.write("\t}, {\n");
      out.write("\t\tid : 'button-delete',\n");
      out.write("\t\ttext : '作废',\n");
      out.write("\t\ticonCls : 'icon-cancel',\n");
      out.write("\t\thandler : doDelete\n");
      out.write("\t},{\n");
      out.write("\t\tid : 'button-save',\n");
      out.write("\t\ttext : '还原',\n");
      out.write("\t\ticonCls : 'icon-save',\n");
      out.write("\t\thandler : doRestore\n");
      out.write("\t}];\n");
      out.write("\t// 定义列\n");
      out.write("\tvar columns = [ [ {\n");
      out.write("\t\tfield : 'id',\n");
      out.write("\t\tcheckbox : true,\n");
      out.write("\t},{\n");
      out.write("\t\tfield : 'name',\n");
      out.write("\t\ttitle : '姓名',\n");
      out.write("\t\twidth : 120,\n");
      out.write("\t\talign : 'center'\n");
      out.write("\t}, {\n");
      out.write("\t\tfield : 'telephone',\n");
      out.write("\t\ttitle : '手机号',\n");
      out.write("\t\twidth : 120,\n");
      out.write("\t\talign : 'center'\n");
      out.write("\t}, {\n");
      out.write("\t\tfield : 'haspda',\n");
      out.write("\t\ttitle : '是否有PDA',\n");
      out.write("\t\twidth : 120,\n");
      out.write("\t\talign : 'center',\n");
      out.write("\t\tformatter : function(data,row, index){\n");
      out.write("\t\t\tif(data==\"1\"){\n");
      out.write("\t\t\t\treturn \"有\";\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\treturn \"无\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t}, {\n");
      out.write("\t\tfield : 'deltag',\n");
      out.write("\t\ttitle : '是否作废',\n");
      out.write("\t\twidth : 120,\n");
      out.write("\t\talign : 'center',\n");
      out.write("\t\tformatter : function(data,row, index){\n");
      out.write("\t\t\tif(data==\"0\"){\n");
      out.write("\t\t\t\treturn \"正常使用\"\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\treturn \"已作废\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t}, {\n");
      out.write("\t\tfield : 'standard',\n");
      out.write("\t\ttitle : '取派标准',\n");
      out.write("\t\twidth : 120,\n");
      out.write("\t\talign : 'center',\n");
      out.write("\t\tformatter : function(data,row, index){\n");
      out.write("\t\t\treturn data.name;\n");
      out.write("\t\t}\n");
      out.write("\t}, {\n");
      out.write("\t\tfield : 'station',\n");
      out.write("\t\ttitle : '所谓单位',\n");
      out.write("\t\twidth : 200,\n");
      out.write("\t\talign : 'center'\n");
      out.write("\t} ] ];\n");
      out.write("\t\n");
      out.write("\t$(function(){\n");
      out.write("\t\t// 先将body隐藏，再显示，不会出现页面刷新效果\n");
      out.write("\t\t$(\"body\").css({visibility:\"visible\"});\n");
      out.write("\t\t\n");
      out.write("\t\t// 取派员信息表格\n");
      out.write("\t\t$('#grid').datagrid( {\n");
      out.write("\t\t\ticonCls : 'icon-forward',\n");
      out.write("\t\t\tfit : true,\n");
      out.write("\t\t\tborder : false,\n");
      out.write("\t\t\trownumbers : true,\n");
      out.write("\t\t\tstriped : true,\n");
      out.write("\t\t\tpageList: [3,5,10],\n");
      out.write("\t\t\tpagination : true,\n");
      out.write("\t\t\ttoolbar : toolbar,\n");
      out.write("\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staff_pageQuery.action\",\n");
      out.write("\t\t\tidField : 'id',\n");
      out.write("\t\t\tcolumns : columns,\n");
      out.write("\t\t\tonDblClickRow : doDblClickRow\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t// 添加取派员窗口\n");
      out.write("\t\t$('#addStaffWindow').window({\n");
      out.write("\t        title: '添加取派员',\n");
      out.write("\t        width: 400,\n");
      out.write("\t        modal: true,\n");
      out.write("\t        shadow: true,\n");
      out.write("\t        closed: true,\n");
      out.write("\t        height: 400,\n");
      out.write("\t        resizable:false\n");
      out.write("\t    });\n");
      out.write("\t\t\n");
      out.write("\t\t/* // 页面加载后，发起ajax请求\n");
      out.write("\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/standard_ajaxlist.action\",function(data){\n");
      out.write("\t\t\tfor(var i=0; i < data.length;i++) {\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t$(data).each(function(){\n");
      out.write("\t\t\t\tvar option =$(\"<option value='\"+this.id+\"'>\"+this.name+\"</option>\");\n");
      out.write("\t\t\t\t$(\"#standardList\").append(option);\n");
      out.write("\t\t\t\t//应用combobox效果\n");
      out.write("\t\t\t\t$(\"#standardList\").combobox();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}); */\n");
      out.write("\t\t\n");
      out.write("\t\t//给保存按钮添加点击事件\n");
      out.write("\t\t$('#save').click(function(){\n");
      out.write("\t\t\t//表单form校验\n");
      out.write("\t\t\tif($('#staffForm').form('validate')) {\n");
      out.write("\t\t\t\t//通过校验\n");
      out.write("\t\t\t\t$('#staffForm').submit();\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\t//校验失败\n");
      out.write("\t\t\t\t$.messager.alert('警告','表单存在非法数据项','warning');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\tfunction doDblClickRow(rowIndex, rowData){\n");
      out.write("\t\t//form回显\n");
      out.write("\t\t$('#name').val(rowData.name);\n");
      out.write("\t\t$('#telephone').val( rowData.telephone);\n");
      out.write("\t\t$('#station').val(rowData.station);\n");
      out.write("\t\t//pda勾选\n");
      out.write("\t\tif(rowData.haspda == \"1\") {\n");
      out.write("\t\t\t$('#haspda').attr(\"checked\",\"checked\");\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\t$('#haspda').removeAttr(\"checked\");\n");
      out.write("\t\t}\n");
      out.write("\t\t$('#standardId').combobox('setValue', rowData.standard.id);\n");
      out.write("\t\t$('#id').val(rowData.id);\n");
      out.write("\t\t$('#id').attr('readonly','readonly');\n");
      out.write("\t\t//弹出修改窗口\n");
      out.write("\t\t$(\"#addStaffWindow\").window('open');\n");
      out.write("\t}\n");
      out.write("</script>\t\n");
      out.write("</head>\n");
      out.write("<body class=\"easyui-layout\" style=\"visibility:hidden;\">\n");
      out.write("\t<form id=\"delForm\" method=\"post\">\n");
      out.write("\t\t<div region=\"center\" border=\"false\">\n");
      out.write("\t    \t<table id=\"grid\"></table>\n");
      out.write("\t\t</div>\n");
      out.write("\t</form>\n");
      out.write("\t<div class=\"easyui-window\" title=\"对收派员进行添加或者修改\" id=\"addStaffWindow\" collapsible=\"false\" minimizable=\"false\" maximizable=\"false\" style=\"top:20px;left:200px\">\n");
      out.write("\t\t<div region=\"north\" style=\"height:31px;overflow:hidden;\" split=\"false\" border=\"false\" >\n");
      out.write("\t\t\t<div class=\"datagrid-toolbar\">\n");
      out.write("\t\t\t\t<a id=\"save\" icon=\"icon-save\" href=\"#\" class=\"easyui-linkbutton\" plain=\"true\" >保存</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div region=\"center\" style=\"overflow:auto;padding:5px;\" border=\"false\">\n");
      out.write("\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staff_saveOrUpdate.action\" method=\"post\" id=\"staffForm\">\n");
      out.write("\t\t\t\t<table class=\"table-edit\" width=\"80%\" align=\"center\">\n");
      out.write("\t\t\t\t\t<tr class=\"title\">\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">收派员信息</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<!-- TODO 这里完善收派员添加 table -->\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>取派员编号</td>\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" id=\"id\" name=\"id\" class=\"easyui-validatebox\" required=\"true\"/></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>姓名</td>\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" id=\"name\" name=\"name\" class=\"easyui-validatebox\" required=\"true\"/></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>手机</td>\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" id=\"telephone\" name=\"telephone\" class=\"easyui-validatebox\" required=\"true\"/></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>单位</td>\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" id=\"station\" name=\"station\" class=\"easyui-validatebox\" required=\"true\"/></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" id=\"haspda\" name=\"haspda\" value=\"1\" />\n");
      out.write("\t\t\t\t\t\t是否有PDA</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>取派标准</td>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t<!-- 目标model是staff，提供setStandard方法，在Standard中提供setId的方法 -->\n");
      out.write("\t\t\t\t\t\t\t<input class=\"easyui-combobox\" name=\"standard.id\"  id=\"standardId\" \n");
      out.write("    \t\t\t\t\t\t\tdata-options=\"valueField:'id',textField:'name',url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/standard_ajaxlist.action',required:true\" />  \n");
      out.write("    \t\t\t\t\t\t<!-- <select id=\"standardList\">\n");
      out.write("    \t\t\t\t\t\t</select> -->\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\t");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}