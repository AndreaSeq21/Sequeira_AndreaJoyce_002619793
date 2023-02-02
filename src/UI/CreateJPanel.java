/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.ChefDetails;
import Model.ContactInformation;
import Model.Recipe;
import Validation.ValidationClass;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private ChefDetails chefDetails;
    private Recipe recipe;
    private ValidationClass val;

    public CreateJPanel() {
        initComponents();
    }

    CreateJPanel(ChefDetails chefDetails) {
        initComponents();
        this.chefDetails = chefDetails;
        recipe = this.chefDetails.getRecipe();
        val = new ValidationClass();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contactDetailLabel = new javax.swing.JLabel();
        chefFirstName = new javax.swing.JTextField();
        chefFirstNamejLabel = new javax.swing.JLabel();
        chefLastNamejLabel = new javax.swing.JLabel();
        chefLastName = new javax.swing.JTextField();
        userName = new javax.swing.JTextField();
        userNamejLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        noOfServing = new javax.swing.JTextField();
        recipeTitle = new javax.swing.JTextField();
        recipeTitlejLabel = new javax.swing.JLabel();
        noOfServingjLabel = new javax.swing.JLabel();
        noOfServingjLabel1 = new javax.swing.JLabel();
        noOfServing1 = new javax.swing.JTextField();
        noOfIngredientsjLabel = new javax.swing.JLabel();
        noOfIngredients = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        glutenFreeComboBox = new javax.swing.JComboBox<>();
        glutenFreeLabel1 = new javax.swing.JLabel();
        descriptionSlider = new javax.swing.JSlider();
        glutenFreeLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        categoryOfFoodLabel = new javax.swing.JLabel();
        recipePictureLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        emailId = new javax.swing.JTextField();
        emailIdLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        browsePictureButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        sliderTextField = new javax.swing.JTextField();
        categoryOfFoodComboBox = new javax.swing.JComboBox<>();
        imageBorderLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contactDetailLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contactDetailLabel.setText("Contact Details");
        add(contactDetailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 110, 30));

        chefFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chefFirstNameActionPerformed(evt);
            }
        });
        add(chefFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 70, 30));

        chefFirstNamejLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        chefFirstNamejLabel.setText("Chef's First Name");
        add(chefFirstNamejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        chefLastNamejLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        chefLastNamejLabel.setText("Chef's Last Name");
        add(chefLastNamejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        chefLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chefLastNameActionPerformed(evt);
            }
        });
        add(chefLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 70, 30));

        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 70, 30));

        userNamejLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        userNamejLabel.setText("Username");
        add(userNamejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CREATE");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 70, 30));

        noOfServing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfServingActionPerformed(evt);
            }
        });
        add(noOfServing, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 70, 30));

        recipeTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recipeTitleActionPerformed(evt);
            }
        });
        add(recipeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 70, 30));

        recipeTitlejLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        recipeTitlejLabel.setText("Recipe Title");
        add(recipeTitlejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        noOfServingjLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        noOfServingjLabel.setText("No. of servings");
        add(noOfServingjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        noOfServingjLabel1.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        noOfServingjLabel1.setText("No. of servings");
        add(noOfServingjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        noOfServing1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfServing1ActionPerformed(evt);
            }
        });
        add(noOfServing1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 70, 30));

        noOfIngredientsjLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        noOfIngredientsjLabel.setText("No. of Ingredients");
        add(noOfIngredientsjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        noOfIngredients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfIngredientsActionPerformed(evt);
            }
        });
        add(noOfIngredients, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 70, 30));

        descriptionLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        descriptionLabel.setText("Description");
        add(descriptionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 80, 30));

        glutenFreeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        add(glutenFreeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 60, 20));

        glutenFreeLabel1.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        glutenFreeLabel1.setText("is gluten free?");
        add(glutenFreeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 80, 20));

        descriptionSlider.setMaximum(5);
        descriptionSlider.setMinimum(1);
        descriptionSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                descriptionSliderMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                descriptionSliderMouseMoved(evt);
            }
        });
        descriptionSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descriptionSliderMouseClicked(evt);
            }
        });
        add(descriptionSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 140, -1));

        glutenFreeLabel3.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        glutenFreeLabel3.setText("Difficult level");
        add(glutenFreeLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 80, 20));

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane2.setViewportView(descriptionTextArea);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 180, 120));

        categoryOfFoodLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        categoryOfFoodLabel.setText("Category of food");
        add(categoryOfFoodLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 90, 20));

        recipePictureLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        recipePictureLabel.setText("Recipe Picture");
        add(recipePictureLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Recipe Details");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, 30));

        phoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberActionPerformed(evt);
            }
        });
        add(phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 120, 30));

        emailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailIdActionPerformed(evt);
            }
        });
        add(emailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 120, 30));

        emailIdLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        emailIdLabel.setText("Email Id");
        add(emailIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 50, 20));

        phoneNumberLabel.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        phoneNumberLabel.setText("Phone");
        add(phoneNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 60, 20));

        browsePictureButton.setText("BROWSE");
        browsePictureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsePictureButtonActionPerformed(evt);
            }
        });
        add(browsePictureButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 100, 20));

        saveButton.setText("SAVE ");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, 110, 40));

        sliderTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sliderTextFieldActionPerformed(evt);
            }
        });
        add(sliderTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 40, 30));

        categoryOfFoodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indian", "Italian", "Chinese", "Japanese" }));
        add(categoryOfFoodComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        imageBorderLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        imageBorderLabel.setForeground(new java.awt.Color(255, 255, 255));
        imageBorderLabel.setText("      Upload your image ");
        imageBorderLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(imageBorderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 180, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void chefFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chefFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chefFirstNameActionPerformed

    private void chefLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chefLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chefLastNameActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void noOfServingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfServingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noOfServingActionPerformed

    private void recipeTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recipeTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recipeTitleActionPerformed

    private void noOfServing1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfServing1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noOfServing1ActionPerformed

    private void noOfIngredientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfIngredientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noOfIngredientsActionPerformed

    private void phoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberActionPerformed

    private void emailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailIdActionPerformed

    private void browsePictureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsePictureButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            System.out.println(selectedImagePath);
            JOptionPane.showMessageDialog(null, selectedImagePath);
            //Store the filePath in recipe picture variable

            recipe.setRecipePicture(selectedImagePath);
            System.out.println("displaypath:" + recipe.getRecipePicture());
            ImageIcon ii = new ImageIcon(selectedImagePath);
            Image image = ii.getImage().getScaledInstance(imageBorderLabel.getWidth(), imageBorderLabel.getHeight(), Image.SCALE_SMOOTH);
            imageBorderLabel.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_browsePictureButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        String chefFirstNameValue = chefFirstName.getText();
        String chefLastNameValue = chefLastName.getText();
        String userNameValue = userName.getText();
        String recipeTitleValue = recipeTitle.getText();
        String noOfServingValue = noOfServing.getText();
        String noOfIngredientsValue = noOfIngredients.getText();
        String categoryOfFoodComboBoxValue = categoryOfFoodComboBox.getSelectedItem().toString();
        String emailIdValue = emailId.getText();
        String phoneNumberValue = phoneNumber.getText();
        String glutenFreeComboBoxValue = glutenFreeComboBox.getSelectedItem().toString();
        String diffcultyLevelValue = String.valueOf(sliderTextField.getText());
        String descriptionValue = descriptionTextArea.getText();



        //System.out.println("recipe picture value " + recipe.getRecipePicture());
        String recipePicture = recipe.getRecipePicture();

        //validation check
        boolean flag = false;
        if (val.validateEmail(emailIdValue)) {
            flag = true;
            JOptionPane.showMessageDialog(null, "Email format: someone@email.com", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            System.out.println("Email Validation check passed");
        }

        if (val.validateName(chefFirstNameValue) || val.validateName(chefLastNameValue)) {
            flag = true;
            System.out.println(" " + chefFirstNameValue + " " + chefLastNameValue );
            JOptionPane.showMessageDialog(null, "Entered Name is not correct!!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            System.out.println("Name check passed");
        }

        if (val.nullCheck(emailIdValue) || val.nullCheck(userNameValue) || val.nullCheck(chefFirstNameValue) || val.nullCheck(chefLastNameValue) || val.nullCheck(recipeTitleValue) || val.nullCheck(noOfServingValue) || val.nullCheck(noOfIngredientsValue) || val.nullCheck(categoryOfFoodComboBoxValue) || val.nullCheck(phoneNumberValue) || val.nullCheck(glutenFreeComboBoxValue) || val.nullCheck(diffcultyLevelValue) || val.nullCheck(descriptionValue) || val.nullCheck(recipePicture)) {
            flag = true;
            JOptionPane.showMessageDialog(null, "Null values not allowed!!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            System.out.println("Null check passed");
        }

        if (val.phoneNumberCheck(phoneNumberValue)) {
            flag = true;
            JOptionPane.showMessageDialog(null, "Phone Number should be 10 Characters", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            System.out.println("Phone Number check passed");
        }
        
       if (val.silderCheck(diffcultyLevelValue)) {
            flag = true;
            JOptionPane.showMessageDialog(null, "Difficulty level should be between 1 to 5", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            System.out.println("Difficulty level check passed");
        }

        
        //Store values
        this.chefDetails.setChefFirstName(chefFirstNameValue);
        this.chefDetails.setChefLastName(chefLastNameValue);
        this.chefDetails.setUserName(userNameValue);

        recipe.setRecipeTitle(recipeTitleValue);
        recipe.setNoOfServing(Integer.valueOf(noOfServingValue));
        recipe.setNoOfIngredients(Integer.valueOf(noOfIngredientsValue));
        recipe.setCategoryOfFood(categoryOfFoodComboBoxValue);
        Boolean glutenFreeValue = true;
        if (glutenFreeComboBoxValue == "Yes") {
            glutenFreeValue = true;
        } else {
            glutenFreeValue = false;
        }
        recipe.setIsGlutenFree(glutenFreeValue);
        recipe.setDifficultyLevel(Double.valueOf(diffcultyLevelValue));
        recipe.setDescription(descriptionValue);

        ContactInformation contact = this.chefDetails.getContact();
        contact.setEmailId(emailIdValue);
        contact.setPhoneNumber(Long.valueOf(phoneNumberValue));
        
        
        if (flag == false) {
            JOptionPane.showMessageDialog(null, "SAVED SUCCESSFULLY");
        } else {
            System.out.println("Validation check failed");
        }


    }//GEN-LAST:event_saveButtonActionPerformed

    private void sliderTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sliderTextFieldActionPerformed
        // TODO add your handling code here:
        double sliderNumber = descriptionSlider.getValue();
        sliderTextField.setText(String.valueOf(sliderNumber));

    }//GEN-LAST:event_sliderTextFieldActionPerformed

    private void descriptionSliderMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descriptionSliderMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionSliderMouseMoved

    private void descriptionSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descriptionSliderMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionSliderMouseDragged

    private void descriptionSliderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descriptionSliderMouseClicked
        // TODO add your handling code here:
        int sliderNumber = descriptionSlider.getValue();
        sliderTextField.setText(String.valueOf(sliderNumber));
    }//GEN-LAST:event_descriptionSliderMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browsePictureButton;
    private javax.swing.JComboBox<String> categoryOfFoodComboBox;
    private javax.swing.JLabel categoryOfFoodLabel;
    private javax.swing.JTextField chefFirstName;
    private javax.swing.JLabel chefFirstNamejLabel;
    private javax.swing.JTextField chefLastName;
    private javax.swing.JLabel chefLastNamejLabel;
    private javax.swing.JLabel contactDetailLabel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JSlider descriptionSlider;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JTextField emailId;
    private javax.swing.JLabel emailIdLabel;
    private javax.swing.JComboBox<String> glutenFreeComboBox;
    private javax.swing.JLabel glutenFreeLabel1;
    private javax.swing.JLabel glutenFreeLabel3;
    private javax.swing.JLabel imageBorderLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField noOfIngredients;
    private javax.swing.JLabel noOfIngredientsjLabel;
    private javax.swing.JTextField noOfServing;
    private javax.swing.JTextField noOfServing1;
    private javax.swing.JLabel noOfServingjLabel;
    private javax.swing.JLabel noOfServingjLabel1;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JLabel recipePictureLabel;
    private javax.swing.JTextField recipeTitle;
    private javax.swing.JLabel recipeTitlejLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField sliderTextField;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel userNamejLabel;
    // End of variables declaration//GEN-END:variables
}
