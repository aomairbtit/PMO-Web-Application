<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>Risks</name>
   <tag></tag>
   <elementGuidId>430f0140-3a4c-406e-99cd-59090e0ef89c</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='Risks']/div/div</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>col</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
                                
                                    
                                        
                                            قائمة المخاطر
                                            إضافة جديد
                                        
                                        
                                            

    
        
            الخطر
            *
            
        
        
            خطة التعامل
            *
            
        
        
            الأثر
            *
            
                إختر ...
                    عالي
                    متوسط
                    منخفض
            
        
        
            الاحتمالية
            *
            
                إختر ...
                    عالي
                    متوسط
                    منخفض
            
        
        
            الحالة
            
                    عالي
                    متوسط
                    منخفض
            
        
    
    
        
            حفظ
            الغاء
        
    



    
        
            
                #
                الخطر
                الأثر
                الاحتمالية
                خطة التعامل مع الخطر
                الحالة
                
            
        
        
        
    






    $(function () {
        $('#ddlRiskImpactLkpId,#ddlProbabilityLkpId').change(function () {
            var statusId = getRiskStatus($('#ddlRiskImpactLkpId').val(), $('#ddlProbabilityLkpId').val());
            $('#ddlStatusLkpId').val(statusId);
        });
        $('#btnAddRisk').click(function (e) {
            debugger;
            var tblBody = $('#tblProjectCharterRisks tbody');
            var risk = $('#txtRisk').val().trim();
            var impactLkpId = $('#ddlRiskImpactLkpId').val();
            var impactText = $('#ddlRiskImpactLkpId').find('option:selected').text();
            var probabilityLkpId = $('#ddlProbabilityLkpId').val().trim();
            var probabilityText = $('#ddlProbabilityLkpId').find('option:selected').text();
            var methodOfHandling = $('#txtMethodOfHandling').val().trim();
            var statusId = getRiskStatus(impactLkpId, probabilityLkpId);
            $('#ddlStatusLkpId').val(statusId);
            var statusText = $('#ddlStatusLkpId').find('option:selected').text();
            if (risk != '' &amp;&amp; impactLkpId != '' &amp;&amp; probabilityLkpId != '' &amp;&amp; methodOfHandling != '') {
                if (tblBody &amp;&amp; tblBody.length > 0) {
                        var index = $('[data-update-project-newrisks-rowindex]').attr('data-update-project-newrisks-rowindex');
                        var row = '&lt;tr data-ProjectCharterRisk=&quot;' + risk + '&quot; data-ProjectCharterImpactLkpId=&quot;' + impactLkpId + '&quot; data-ProjectCharterProbabilityLkpId=&quot;' + probabilityLkpId + '&quot;  data-ProjectCharterMethodOfHndling=&quot;' + methodOfHandling + '&quot;>' +
                            '&lt;td data-tblIndex>' + '&lt;/td>' +
                            '&lt;td>' + risk + '&lt;/td>' +
                            '&lt;td>' + impactText + '&lt;/td>' +
                            '&lt;td>' + probabilityText + '&lt;/td>' +
                            '&lt;td>' + methodOfHandling + '&lt;/td>' +
                            '&lt;td>' + statusText + '&lt;/td>' +
                            '&lt;td class=&quot;text-right&quot;>' +
                            '&lt;a onclick=&quot;updateNewProjectRisks(this)&quot; data-toggle=&quot;tooltip&quot; data-placement=&quot;top&quot; title=&quot;تحرير&quot; class=&quot;mr-2 EditcollapseBtn&quot; target-div=&quot;RisksCollapse&quot;>&lt;i class=&quot;fa fa-pencil-alt text-primary&quot;>&lt;/i>&lt;/a>' +
                            ' &lt;a onclick=&quot;deleteItem(this)&quot; data-toggle=&quot;tooltip&quot; data-placement=&quot;top&quot; title=&quot;حذف&quot;>&lt;i class=&quot;fa fa-trash text-danger&quot;>&lt;/i>&lt;/a>&lt;/td > ' +
                            '&lt;/tr>';
                        if (index &amp;&amp; index != '')
                        {
                            var exist = false;
                            $(tblBody).find('tr').each(function () {
                                if ($(this).find('td').eq(1).text() == risk &amp;&amp; $(this).find('td').eq(0).text() != index) {
                                    exist = true;
                                    return false;
                                }
                            });

                            if (!exist) {
                                $('#tblProjectCharterRisks').find(&quot;tr:eq(&quot; + index + &quot;)&quot;).remove();
                                tblBody.append(row);
                                $('#tblProjectCharterRisks').trigger('rowAddOrRemove');

                                AlertFun(&quot;تم الحفظ بنجاح&quot;, &quot;success&quot;);
                                cancel_ProjectCharterRisks();                            }
                            else
                            {
                                 AlertFun('يجب استكمال بيانات المخاطر بشكل صحيح', &quot;danger&quot;);
                            }
                        }
                        else
                        {
                            if ($(tblBody).find('[data-ProjectCharterRisk=&quot;' + risk + '&quot;]').length == 0) {

                                tblBody.append(row);
                                $('#tblProjectCharterRisks').trigger('rowAddOrRemove');

                                AlertFun(&quot;تم الحفظ بنجاح&quot;, &quot;success&quot;);
                                cancel_ProjectCharterRisks();
                                $('#txtRisk').focus();
                            }
                            else {
                                AlertFun('هذه البيانات مكررة', &quot;danger&quot;);
                            }
                        }

                        updateTableIndex($('#tblProjectCharterRisks'));
                }
            }
            else {
                AlertFun('يجب استكمال بيانات المخاطر بشكل صحيح', &quot;danger&quot;);
            }
        });

    });

    function getProjectCharterRisks() {
        var projectCharterRisks = [];
        $(&quot;#tblProjectCharterRisks tbody tr&quot;).each(function (i, e) {
            var risk = {};
            risk.ProjectCharterRiskId = $(e).attr('data-ProjectCharterRiskId');
            risk.ProjectCharerRisk = $(e).attr('data-ProjectCharterRisk');
            risk.ProbabilityLkpId = $(e).attr('data-ProjectCharterProbabilityLkpId');
            risk.EffictRangeLkpId = $(e).attr('data-ProjectCharterImpactLkpId');
            risk.MethodOfHandlingDescription = $(e).attr('data-ProjectCharterMethodOfHndling');
            risk.StatusLkpId = getRiskStatus(risk.EffictRangeLkpId, risk.ProbabilityLkpId);
            risk.ProjectCharterId = 4546;
            projectCharterRisks.push(risk);
        });
        return projectCharterRisks;
    }

    function validateRisks(obj) {

        var error = false;
        if (!obj || !obj.Risks || obj.Risks.length == 0) {
            error = true;
        }
        if (obj &amp;&amp; obj.Risks) {
            $(obj.Risks).each(function (i, e) {
                if (e.ProjectCharerRisk == '' || !e.ProbabilityLkpId || e.ProbabilityLkpId == '' || !e.EffictRangeLkpId || e.EffictRangeLkpId == '' || e.MethodOfHandlingDescription == '') {
                    error = true;
                    $($($('#tblProjectCharterRisks')[0].rows[i + 1])).addClass('alert alert-danger');
                }
            });
        }
        return error;
    }

    function addNewProjectRisks() {

        clearNewProjectRisks();
    }
    function clearNewProjectRisks() {

        $('#txtRisk').val('');
        $('#ddlRiskImpactLkpId').val('');
        $('#ddlProbabilityLkpId').val('');
        $('#txtMethodOfHandling').val('');
        $('#ddlStatusLkpId').val('');
        $('#txtRisk').focus();
        $('[data-update-project-newrisks-id]').attr('data-update-project-newrisks-id', '0');
        $('[data-update-project-newrisks-rowindex]').attr('data-update-project-newrisks-rowindex', '');
    }
    function updateNewProjectRisks(args) {
        if ($(&quot;#&quot; + $(args).attr(&quot;target-div&quot;)).hasClass(&quot;show&quot;) == false) {
            $(&quot;#&quot; + $(args).attr(&quot;target-div&quot;)).toggleClass(&quot;show&quot;);
        }
        clearNewProjectRisks();
        var row = $(args).closest('tr');
        if (row &amp;&amp; row.length > 0) {
            var risk = {};
            risk.ProjectCharterRiskId = $(row).attr('data-ProjectCharterRiskId');
            risk.ProjectCharerRisk = $(row).attr('data-ProjectCharterRisk');
            risk.ProbabilityLkpId = $(row).attr('data-ProjectCharterProbabilityLkpId');
            risk.EffictRangeLkpId = $(row).attr('data-ProjectCharterImpactLkpId');
            risk.MethodOfHandlingDescription = $(row).attr('data-ProjectCharterMethodOfHndling');
            risk.StatusLkpId = getRiskStatus(risk.EffictRangeLkpId, risk.ProbabilityLkpId);


            $('#txtRisk').val(risk.ProjectCharerRisk);
            $('#txtMethodOfHandling').val(risk.MethodOfHandlingDescription);
            $('#ddlRiskImpactLkpId').val(risk.EffictRangeLkpId);
            $('#ddlProbabilityLkpId').val(risk.ProbabilityLkpId);
            $('#ddlStatusLkpId').val(risk.StatusLkpId);

            $('[data-update-project-newrisks-id]').attr('data-update-project-newrisks-id', risk.ProjectCharterRiskId);
            $('[data-update-project-newrisks-rowindex]').attr('data-update-project-newrisks-rowindex', row[0].rowIndex);
        }
    }
    function cancelNewProjectRisks() {

        clearNewProjectRisks();
    }


    
    function clear_ProjectCharterRisks() {
        $('#txtRisk').val('');
        $('#txtMethodOfHandling').val('');


        $('[data-update-project-newrisks-id]').attr('data-update-project-newrisks-id', '0');
        $('[data-update-project-newrisks-rowindex').attr('data-update-project-newrisks-rowindex', '');
    }
    function cancel_ProjectCharterRisks() {

        clear_ProjectCharterRisks();
    }

    //$('#Add_ProjectCharterRisks').click(function () {
    //    $('#RisksCollapse').show();

    //});

    $('#cancel_ProjectCharterRisks').click(function () {
        $('[data-update-project-newrisks-id]').attr('data-update-project-newrisks-id', '0');
        $('[data-update-project-newrisks-rowindex').attr('data-update-project-newrisks-rowindex', '');
    });



                                            
                                        
                                    
                                
                            </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;Risks&quot;)/div[@class=&quot;row&quot;]/div[@class=&quot;col&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <value>//div[@id='Risks']/div/div</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='شرح العلاقة'])[2]/following::div[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='اسم المشروع'])[3]/following::div[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <value>//div[2]/div/div/div[6]/div/div</value>
   </webElementXpaths>
</WebElementEntity>
